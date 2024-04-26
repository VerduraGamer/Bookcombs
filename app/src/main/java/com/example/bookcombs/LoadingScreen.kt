package com.example.bookcombs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoadingScreen() {
    Surface(
        color = Color(0xFF17120B),
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val appIcon: Painter = painterResource(id = R.drawable.bookcombs)
            Image(
                painter = appIcon,
                contentDescription = "Ícone do aplicativo"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Pontos()
        }
    }
}

@Composable
fun Pontos() {
    Text("...", color = Color.White)
}

@Preview
@Composable
fun PreviewLoadingScreen() {
    LoadingScreen()
}