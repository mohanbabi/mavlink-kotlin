plugins {
    kotlin("jvm")
    id("com.vanniktech.maven.publish.base")
}

version = Specs.Lib.developmentVersion

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation(project(":mavlink-kotlin"))
    api(Deps.rxJava3)

    testImplementation(project(":definitions"))
    testImplementation(TestDeps.jupiterApi)
    testRuntimeOnly(TestDeps.jupiterEngine)
}

@Suppress("UnstableApiUsage")
mavenPublishing {
    configure(com.vanniktech.maven.publish.KotlinJvm())
}
