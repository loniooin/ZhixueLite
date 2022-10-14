plugins {
    library
    kotlinAndroid
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
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.uiTooling)
    implementation(Libs.Compose.animation)
    implementation(Libs.Accompanist.sysUiController)
}