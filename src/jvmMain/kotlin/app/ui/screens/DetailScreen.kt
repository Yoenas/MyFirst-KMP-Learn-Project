package app.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailScreen(onBack: () -> Unit) {
    Column {
        Text("📄 This is Detail Screen")
        Button(onClick = onBack) {
            Text("Back to Home")
        }
    }
}
