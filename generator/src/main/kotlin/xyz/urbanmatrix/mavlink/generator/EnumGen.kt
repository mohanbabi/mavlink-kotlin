package xyz.urbanmatrix.mavlink.generator

import com.squareup.kotlinpoet.*
import xyz.urbanmatrix.mavlink.api.GeneratedMavEnum
import xyz.urbanmatrix.mavlink.api.MavEnum
import xyz.urbanmatrix.mavlink.generator.models.EnumModel
import kotlin.Long

fun EnumModel.generateEnumFile(packageName: String): FileSpec {
    val enum = TypeSpec.enumBuilder(formattedName)
        .addSuperinterface(MavEnum::class)
        .primaryConstructor(generatePrimaryConstructor())
        .addProperty(generateValueProperty())
        .apply {
            entries.forEach { addEnumConstant(it.name, it.generateEnumConstant()) }
            if (deprecated != null) addAnnotation(deprecated.generateAnnotation())
            if (description != null) addKdoc(description.replace("%", "%%"))
        }
        .addAnnotation(GeneratedMavEnum::class)
        .addType(generateCompanionObject(packageName))
        .build()

    return FileSpec.builder(packageName, formattedName)
        .addType(enum)
        .build()
}

private fun generatePrimaryConstructor() = FunSpec
    .constructorBuilder()
    .addParameter("value", Long::class)
    .build()

private fun generateValueProperty() = PropertySpec
    .builder("value", Long::class, KModifier.OVERRIDE)
    .initializer("value")
    .build()

private fun EnumModel.generateCompanionObject(packageName: String) = TypeSpec
    .companionObjectBuilder()
    .addFunction(generateGetEntryFromValueOrNull(packageName))
    .build()

private fun EnumModel.generateGetEntryFromValueOrNull(packageName: String) = FunSpec
    .builder("getEntryFromValueOrNull")
    .addParameter(ParameterSpec("v", Long::class.asTypeName()))
    .returns(getClassName(packageName).copy(nullable = true))
    .addCode(
        buildCodeBlock {
            beginControlFlow("return when (v) {")
            entries.forEach { addStatement("${it.value}L -> ${it.name}") }
            addStatement("else -> null")
            endControlFlow()
        }
    )
    .build()

private fun EnumModel.getClassName(packageName: String): ClassName =
    ClassName(packageName, formattedName)

