package com.example.bookcombs

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginPage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF161518))
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
                .background(Color(0xFF161518)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        //.width(600.dp)
                        .height(400.dp)
                        .background(Color(0xFF17120B)),
                    elevation = 5.dp,
                    border = BorderStroke(2.dp, Color.Gray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("NOME DE USUÁRIO") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        keyboardOptions = KeyboardOptions.Default
                    )

                    // Campo de senha
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("SENHA") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp),
                        keyboardOptions = KeyboardOptions.Default,
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Text("Iniciar sessão")
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 8.dp)
                    ) {
                        Text("Registrar conta")
                    }
                    Button(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("Continuar sem uma conta")
                    }
                }
            }
            Text(
                text = "Não consigo iniciar a sessão",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .clickable {}
            )
        }
    }
}

@Preview
@Composable
fun PreviewLoginPage() {
    LoginPage()
}