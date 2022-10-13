plugins {
    library
    kotlinAndroid
}

android {
    compileSdk = Configurations.compileSdk
}

dependencies {
    implementation(Libs.Compose.material)
    implementation(Libs.Compose.uiTooling)
    implementation(Libs.Compose.animation)
    implementation(Libs.Accompanist.sysUiController)
}