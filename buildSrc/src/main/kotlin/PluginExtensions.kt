import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.library: PluginDependencySpec
    get() = id("com.android.library")

inline val PluginDependenciesSpec.application: PluginDependencySpec
    get() = id("com.android.application")

inline val PluginDependenciesSpec.kotlinKapt: PluginDependencySpec
    get() = id("org.jetbrains.kotlin.kapt")

inline val PluginDependenciesSpec.kotlinAndroid: PluginDependencySpec
    get() = id("org.jetbrains.kotlin.android")

inline val PluginDependenciesSpec.hiltAndroid: PluginDependencySpec
    get() = id("dagger.hilt.android.plugin")