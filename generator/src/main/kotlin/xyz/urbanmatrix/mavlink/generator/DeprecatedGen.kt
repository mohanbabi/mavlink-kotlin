package xyz.urbanmatrix.mavlink.generator

import com.squareup.kotlinpoet.AnnotationSpec
import xyz.urbanmatrix.mavlink.generator.models.DeprecatedModel

fun DeprecatedModel.generateAnnotation() = AnnotationSpec
    .builder(Deprecated::class)
    .addMember("message = %S", content ?: "")
    .build()
