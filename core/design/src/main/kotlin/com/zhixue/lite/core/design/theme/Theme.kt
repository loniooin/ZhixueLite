package com.zhixue.lite.core.design.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val darkColorScheme = darkColors(
    primary = darkPrimary,
    primaryVariant = darkPrimary,
    secondary = darkPrimary,
    secondaryVariant = darkPrimary,
    surface = darkSurface
)

private val lightColorScheme = lightColors(
    primary = lightPrimary,
    primaryVariant = lightPrimary,
    secondary = lightPrimary,
    secondaryVariant = lightPrimary,
    surface = lightSurface
)

@Composable
fun ZhixueTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
    
    val sysUiController = rememberSystemUiController()
    
    SideEffect {
        sysUiController.setSystemBarsColor(colorScheme.surface)
    }
    
    MaterialTheme(
        colors = colorScheme,
        content = content
    )
}