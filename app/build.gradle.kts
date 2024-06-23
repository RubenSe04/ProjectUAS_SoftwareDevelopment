plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.firebase.firebase.perf)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.mycoffeapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mycoffeapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.activity)
    implementation(libs.firebase.perf)
    implementation(libs.firebase.auth)
<<<<<<< HEAD
    implementation(libs.firebase.database)
=======
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Rounded Imageview
    implementation("com.makeramen:roundedimageview:2.3.0")
<<<<<<< HEAD

    dependencies {
        // Import the BoM for the Firebase platform
        implementation(platform("com.google.firebase:firebase-bom:33.1.0"))

        // Add the dependency for the Firebase Authentication library
        // When using the BoM, you don't specify versions in Firebase library dependencies
        implementation("com.google.firebase:firebase-auth")

        // Also add the dependency for the Google Play services library and specify its version
        implementation("com.google.android.gms:play-services-auth:21.2.0")
    }
=======
>>>>>>> 7ba663261b84211089979303eaa809cf8cb0d744
}