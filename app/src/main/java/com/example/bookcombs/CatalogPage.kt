package com.example.bookcombs

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CatalogPage() {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color(0xFFFFA500),
                elevation = AppBarDefaults.TopAppBarElevation,
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = "Menu",
                            tint = Color.Unspecified
                            //TODO Implementar a lógica de clique para abrir o menu
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Catálogo geral",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Icon(
                            painter = painterResource(id = R.drawable.add),
                            contentDescription = "Add",
                            tint = Color.Unspecified
                            //TODO Implementar a lógica de clique para adicionar um livro
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "Search",
                            tint = Color.Unspecified
                            //TODO Implementar a lógica de clique para abrir a tela de pesquisa
                        )
                    }
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF242226))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF161518))
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Exibindo 3 livros, quadrinhos, filmes e jogos.",
                        fontSize = 14.sp,
                        color = Color.White
                    )
                }
                // Informações do livro 1
                BookInfo(
                    bookName = "Blue Lock Vol. 7",
                    author = "Muneyuki Kaneshiro",
                    modifier = Modifier.fillMaxWidth()
                )

                Divider(color = Color.Gray, thickness = 1.dp)

                // Informações do livro 2
                BookInfo(
                    bookName = "Quincas Borba",
                    author = "Machado de Assis",
                    modifier = Modifier.fillMaxWidth()
                )

                Divider(color = Color.Gray, thickness = 1.dp)

                // Informações do livro 3
                BookInfo(
                    bookName = "Feliz Ano Velho",
                    author = "Marcelo Rubens Paiva",
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    )
}

@Composable
fun BookInfo(bookName: String, author: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(100.dp, 150.dp)
                .background(Color.Gray)
        ) {
            Image(
                painter = painterResource(id = R.drawable.livro2),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = bookName,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = author,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            painter = painterResource(id = R.drawable.delete_sign),
            contentDescription = "Delete icon",
            tint = Color.Unspecified
            //TODO Implementar a lógica de clique para deletar o livro
        )
        Spacer(modifier = Modifier.width(8.dp))
        Icon(
            painter = painterResource(id = R.drawable.pencil),
            contentDescription = "Edit",
            tint = Color.Unspecified

            //TODO Implementar a lógica de clique para editar o livro
        )
    }
}

@Preview
@Composable
fun PreviewCatalogPage() {
    CatalogPage()
}
