package app.navigation

import androidx.compose.runtime.*
import app.ui.screens.DetailScreen
import app.ui.screens.HomeScreen

@Composable
fun AppNavigator() {
    var currentScreen by remember { mutableStateOf("home") }

    when (currentScreen) {
        "home" -> HomeScreen(onNavigate = { currentScreen = "detail" })
        "detail" -> DetailScreen(onBack = { currentScreen = "home" })
    }
}
