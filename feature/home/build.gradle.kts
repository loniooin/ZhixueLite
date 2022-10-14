plugins {
    library
    kotlinKapt
    kotlinAndroid
    hiltAndroid
}

android {
    compileSdk = Configurations.compileSdk
    
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
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.uiTooling)
    implementation(Libs.Compose.animation)
    implementation(Libs.Compose.navigation)
    kapt(Libs.Hilt.hiltCompiler)
}