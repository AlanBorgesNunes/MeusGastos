plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
    id ("kotlin-android")
    id ("dagger.hilt.android.plugin")
    id ("kotlin-kapt")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.app.meusgastos"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.app.meusgastos"
        minSdk = 24
        //noinspection EditedTargetSdkVersion
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    viewBinding{
        enable = true

    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    //noinspection GradleCompatible
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation(platform("com.google.firebase:firebase-bom:32.5.0"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation ("com.google.firebase:firebase-firestore-ktx:24.9.1")
    implementation ("com.google.firebase:firebase-auth-ktx:22.2.0")

    implementation ("com.squareup.picasso:picasso:2.71828")

    implementation ("com.google.dagger:hilt-android:2.46")
    kapt ("com.google.dagger:hilt-android-compiler:2.46")
    kapt ("androidx.hilt:hilt-compiler:1.1.0")

    implementation ("androidx.lifecycle:lifecycle-viewmodel: 2.4.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx: 2.4.0")

    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation ("androidx.fragment:fragment-ktx:1.6.2")

    implementation("com.facebook.shimmer:shimmer:0.5.0")

    implementation("com.google.firebase:firebase-messaging-ktx:23.0.4")
    implementation("com.google.firebase:firebase-inappmessaging-display-ktx:20.4.0")
}