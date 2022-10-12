object Libs {
    object Plugin {
        private const val hiltGradleVersion = "2.44"
        private const val kotlinGradleVersion = "1.7.10"
        private const val androidGradleVersion = "7.3.0"
        
        const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$hiltGradleVersion"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinGradleVersion"
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
    }
    
    object Hilt {
        private const val hiltVersion = "2.44"
        
        const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:$hiltVersion"
    }
    
    object Retrofit {
        private const val retrofitVersion = "2.9.0"
        
        const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val retrofitConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    }
}