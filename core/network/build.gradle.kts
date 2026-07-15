plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.network"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
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
    implementation(project(":core:config"))
}