buildscript {
    dependencies {
        classpath(Libs.Plugin.hiltGradle)
        classpath(Libs.Plugin.kotlinGradle)
        classpath(Libs.Plugin.androidGradle)
    }
    
    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    repositories {
        google()
        mavenCentral()
    }
}