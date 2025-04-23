package org.example.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.koin.dsl.module

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SkyScannerScanner",
    ) {
        App()
    }
}