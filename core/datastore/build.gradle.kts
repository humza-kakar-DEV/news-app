plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.datastore"
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

    // DataStore (owns it here)
    implementation(libs.datastore.preferences)

    // Koin for DI
    implementation(libs.koin.core)

    implementation(project(":core:common"))
}