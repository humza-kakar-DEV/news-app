plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.example.di"
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

//  Full Koin
    implementation(libs.bundles.koin)

//  All core modules to create their modules
    implementation(project(":core:network"))
    implementation(project(":core:database"))
    implementation(project(":core:datastore"))
    implementation(project(":core:common"))
    implementation(project(":core:config"))

//  All feature modules
    implementation(project(":feature:home:home-impl"))
//    implementation(project(":feature:detail:detail-impl"))
//    implementation(project(":feature:onboarding:onboarding-impl"))
}