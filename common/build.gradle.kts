plugins {
    id("com.android.library")
    id("kotlin-android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "com.yogeshpaliyal.common"
}

dependencies {

    api("androidx.core:core-ktx:1.10.1")
    api("androidx.appcompat:appcompat:1.6.1")

    // apache common codec
    implementation("commons-codec:commons-codec:1.15")

    //Androidx Security
    implementation("androidx.security:security-crypto:1.1.0-alpha06")

    api("androidx.documentfile:documentfile:1.0.1")

    api("androidx.room:room-runtime:${Versions.room}")
    androidTestApi("androidx.test:rules:1.5.0")
    kapt("androidx.room:room-compiler:${Versions.room}")
    api("androidx.room:room-ktx:${Versions.room}")

    // dependency injection
    api("com.google.dagger:hilt-android:${Versions.hilt}")
    kapt("com.google.dagger:hilt-android-compiler:${Versions.hilt}")
    api("androidx.hilt:hilt-work:1.0.0")
    // When using Kotlin.
    kapt("androidx.hilt:hilt-compiler:1.0.0")

    api("androidx.work:work-runtime-ktx:2.8.1")

    api("com.google.android.material:material:1.9.0")

    implementation("com.google.code.gson:gson:2.10.1")

    api("com.google.code.gson:gson:2.10.1")

    api("androidx.datastore:datastore-preferences:1.0.0")

}
