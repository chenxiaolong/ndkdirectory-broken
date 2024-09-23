plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.chiller3.test"

    compileSdk = 35
    buildToolsVersion = "35.0.0"
    ndkVersion = "27.0.12077973"

    defaultConfig {
        applicationId = "com.chiller3.test"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = versionCode.toString()
    }
}

tasks.register("printEager") {
    doLast {
        println("SDK directory: ${android.sdkDirectory}")
        println("NDK directory: ${android.ndkDirectory}")
    }
}

tasks.register("printLazy") {
    doLast {
        println("SDK directory: ${androidComponents.sdkComponents.sdkDirectory.get()}")
        println("NDK directory: ${androidComponents.sdkComponents.ndkDirectory.get()}")
    }
}
