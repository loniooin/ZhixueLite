object Libs {
    object Plugin {
        private const val hiltGradleVersion = "2.44"
        private const val kotlinGradleVersion = "1.7.10"
        private const val androidGradleVersion = "7.3.0"
        
        const val hiltGradle = "com.google.dagger:hilt-android-gradle-plugin:$hiltGradleVersion"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinGradleVersion"
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
    }
    
    object Module {
        const val coreDesign = ":core:design"
    }
    
    object Hilt {
        private const val hiltVersion = "2.44"
        private const val hiltNavVersion = "1.0.0"
        
        const val hiltAndroid = "com.google.dagger:hilt-android:$hiltVersion"
        const val hiltCompiler = "com.google.dagger:hilt-compiler:$hiltVersion"
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavVersion"
    }
    
    object AndroidX {
        private const val splashScreenVersion = "1.0.0"
        
        const val splashScreen = "androidx.core:core-splashscreen:$splashScreenVersion"
    }
    
    object Compose {
        private const val composeVersion = "1.2.1"
        private const val composeNavVersion = "2.5.2"
        private const val composeActivityVersion = "1.6.0"
        
        const val activity = "androidx.activity:activity-compose:$composeActivityVersion"
        const val material = "androidx.compose.material:material:$composeVersion"
        const val uiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"
        const val animation = "androidx.compose.animation:animation:$composeVersion"
        const val navigation = "androidx.navigation:navigation-compose:$composeNavVersion"
    }
    
    object Retrofit {
        private const val retrofitVersion = "2.9.0"
        
        const val retrofit2 = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val retrofitConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    }
    
    object Accompanist {
        private const val accompanistVersion = "0.25.1"
        
        const val sysUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$accompanistVersion"
        const val swipeRefresh =
            "com.google.accompanist:accompanist-swiperefresh:$accompanistVersion"
        const val webView = "com.google.accompanist:accompanist-webview:$accompanistVersion"
        const val viewPager = "com.google.accompanist:accompanist-pager:$accompanistVersion"
        const val permissions = "com.google.accompanist:accompanist-permissions:$accompanistVersion"
        const val placeholder = "com.google.accompanist:accompanist-placeholder:$accompanistVersion"
    }
}