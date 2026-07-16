import java.util.Properties

plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.network"
    compileSdk = 36

    defaultConfig {
        minSdk = 24
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        val localProperties = Properties().apply {
            load(rootProject.file("local.properties").inputStream())
        }
        val newsApiKey = localProperties.getProperty("NEWS_API_KEY")
        buildConfigField("String", "NEWS_API_KEY", "\"$newsApiKey\"")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    // Retrofit (owns it here)
    api(libs.bundles.retrofit)

    // Chucker
    debugApi(libs.chucker.library)
    releaseApi(libs.chucker.library.no.op)

    // Koin for DI
    implementation(libs.koin.core)
    implementation(libs.koin.android)

    implementation(project(":core:common"))
}