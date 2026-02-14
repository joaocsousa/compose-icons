import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin

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
    }
}

plugins {
    id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.13.0"
}

// Fix for JitPack GLIBC incompatibility with newer Node.js versions
rootProject.plugins.withType<NodeJsRootPlugin> {
    rootProject.the<NodeJsRootExtension>().nodeVersion = "16.13.0"
}