plugins {
    id("com.android.library") version "9.2.1"
}

group = "io.objectbox.objectbox_flutter_libs"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

android {
    namespace = "io.objectbox.objectbox_flutter_libs"
    compileSdk = 37

    defaultConfig {
        minSdk = 24 // ObjectBox Android requires Android 5.0 (API level 21)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_21.toString()
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
    }
}

dependencies {
    // ObjectBox Android library that includes an ObjectBox C library version
    implementation("io.objectbox:objectbox-android:5.4.2")
}