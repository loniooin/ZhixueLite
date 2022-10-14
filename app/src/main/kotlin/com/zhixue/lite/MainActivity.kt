package com.zhixue.lite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.zhixue.lite.ui.ZhixueApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化启动页
        installSplashScreen()
        //初始化状态栏
        WindowCompat.setDecorFitsSystemWindows(window, true)
        //初始化软件视图
        setContent { ZhixueApp() }
    }
}