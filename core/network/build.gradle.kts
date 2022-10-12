plugins {
    library
    kotlinKapt
    kotlinAndroid
    hiltAndroid
}

android {
    compileSdk = Configurations.compileSdk
}

dependencies {
    implementation(Libs.Hilt.hiltAndroid)
    implementation(Libs.Retrofit.retrofit2)
    implementation(Libs.Retrofit.retrofitConverter)
    kapt(Libs.Hilt.hiltCompiler)
}