buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    dependencies {
        classpath(libs.plugin.maven)
        classpath(libs.plugin.composeMultiplatform)
        classpath(libs.plugin.composeCompiler)
    }
}

plugins {
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.16.3"
    id("com.vanniktech.maven.publish") version "0.34.0" apply false
}

apiValidation {
    ignoredProjects.add("sample")
}
