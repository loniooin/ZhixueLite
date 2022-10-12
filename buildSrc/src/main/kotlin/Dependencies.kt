object Libs {
    object Plugin {
        private const val hiltGradleVersion = "2.44"
        private const val kotlinGradleVersion = "1.7.10"
        private const val androidGradleVersion = "7.3.0"
        
        const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$hiltGradleVersion"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinGradleVersion"
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
    }
}