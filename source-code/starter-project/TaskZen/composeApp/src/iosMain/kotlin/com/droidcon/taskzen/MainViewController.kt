package com.droidcon.taskzen

import androidx.compose.ui.window.ComposeUIViewController
import com.droidcon.taskzen.di.appModule
import com.droidcon.taskzen.di.platformModule
import com.droidcon.taskzen.ui.home.App
import org.koin.core.context.startKoin

fun MainViewController() = ComposeUIViewController { App() }

class DependenciesProviderHelper {
    fun initKoin() {
        startKoin {
            modules(platformModule + appModule)
        }

    }
}