buildscript {
    repositories {
        jcenter()
        gradlePluginPortal()
    }
}

repositories {
    jcenter()
    gradlePluginPortal()
}

plugins {
    kotlin("jvm")
    `java-library`
}

allprojects {
    group = "io.flowcolab"
    version = "0.1.0-SNAPSHOT"
}

// all projects that are not BOM
configure(subprojects.filter { !it.name.endsWith("-bom") }) {

    apply { plugin("java-library") }

    dependencies {
        api(project(":elasticsearch-recipes-bom"))

        // test

        testImplementation(kotlin("test"))
        testImplementation(kotlin("test-junit"))
    }

//    dependencies {
//        testImplementation(kotlin("test"))
//
//        testImplementation(kotlin("test-junit"))
//
//        // Align versions of all Kotlin components
//        implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
//
//        // Use the Kotlin JDK 8 standard library.
//        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//
//        // Use the Kotlin test library.
//        testImplementation("org.jetbrains.kotlin:kotlin-test")
//
//        // Use the Kotlin JUnit integration.
//        testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
//    }
}