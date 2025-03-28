package app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import app.navigation.AppNavigator

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "KMP Desktop") {
        AppNavigator()
    }
}