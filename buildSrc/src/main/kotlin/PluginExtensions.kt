import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

inline val PluginDependenciesSpec.application: PluginDependencySpec
    get() = id("com.android.application")

inline val PluginDependenciesSpec.kotlinAndroid: PluginDependencySpec
    get() = id("org.jetbrains.kotlin.android")