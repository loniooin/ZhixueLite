plugins {
    application
    kotlinKapt
    kotlinAndroid
    hiltAndroid
}

android {
    namespace = Configurations.nameSpace
    compileSdk = Configurations.compileSdk
    
    defaultConfig {
        applicationId = Configurations.applicationId
        minSdk = Configurations.minSdk
        targetSdk = Configurations.targetSdk
        versionCode = Configurations.versionCode
        versionName = Configurations.versionName
    }
    
    buildTypes {
        getByName(Configurations.release) {
            isMinifyEnabled = Configurations.minifyEnabled
            isShrinkResources = Configurations.shrinkResourcesEnabled
            proguardFile(getDefaultProguardFile(Configurations.defProguardFile))
        }
    }
    
    buildFeatures {
        compose = Configurations.composeEnabled
    }
    
    composeOptions {
        kotlinCompilerExtensionVersion = Configurations.composeCompilerVersion
    }
}

dependencies {
    implementation(Libs.Hilt.hiltAndroid)
    implementation(Libs.Hilt.hiltNavigation)
    implementation(Libs.Compose.activity)
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.uiTooling)
    implementation(Libs.Compose.animation)
    implementation(Libs.Compose.navigation)
    implementation(Libs.AndroidX.splashScreen)
    implementation(project(Libs.Module.coreDesign))
    kapt(Libs.Hilt.hiltCompiler)
}