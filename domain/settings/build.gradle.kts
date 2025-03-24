plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.ktorfit)
}

kotlin{
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "DomainSettings"
            isStatic = true
        }
    }

    jvm("desktop")

    sourceSets{
        commonMain.dependencies {
            implementation(projects.data.settings)

            implementation(libs.koin.core)
        }
    }
}