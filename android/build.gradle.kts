import com.android.build.api.dsl.LibraryExtension
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("com.android.library")
}

group = "io.objectbox.objectbox_flutter_libs"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
}

configure<LibraryExtension> {
    namespace = "io.objectbox.objectbox_flutter_libs"
    compileSdk = 37

    defaultConfig {
        minSdk = 24 // ObjectBox Android requires Android 5.0 (API level 21)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    sourceSets {
        getByName("main") {
            java.setSrcDirs(listOf("src/main/java", "src/main/kotlin"))
        }
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

dependencies {
    // ObjectBox Android library that includes an ObjectBox C library version
    implementation("io.objectbox:objectbox-android:5.4.2")
}
