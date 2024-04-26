package com.example.bookcombs

import androidx.activity.ComponentActivity
import android.os.Bundle
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatalogPage()//Substituir pelos arquivos.kt para acessar as respectivas telas
            //TODO Lógica de navegação
        }
    }
}