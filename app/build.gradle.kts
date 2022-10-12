plugins {
    application
    kotlinAndroid
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
}