package app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(onNavigate: () -> Unit) {
    Column {
        Column {
            Text("Hello World! 👋")
            Text("I'm Yusril, newcomer in KMP.")
            Text("Now, I'm ready to build Desktop App with IntellIJ IDEA")
        }
        Text("🏠 This is Home Screen")
        Button(onClick = onNavigate) {
            Text("Go to Detail")
        }
    }
}
