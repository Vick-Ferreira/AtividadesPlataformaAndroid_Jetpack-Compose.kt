package com.example.cartodevisita

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartodevisita.ui.theme.CartãodeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãodeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()

                ) {
                    Apresentacao("Sou Vitoria Ferreira", "Desenvolvedora Junior!"," Seja Bem vindo" ,"(41)9 9994-4514)", "vitoriaferreira@gmail.com","Lindekin")
                }
            }
        }
    }
}

@SuppressLint("SuspiciousIndentation")
@Composable
fun Apresentacao(name: String,titulo: String,subtitulo: String, txt: String, email: String, redes: String, modifier: Modifier = Modifier) {
    val Img = painterResource(R.drawable.perfil)


        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(25.dp),

            verticalArrangement = Arrangement.SpaceBetween, // Alinhamento vertical das colunas filhas
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Column(modifier = Modifier) {
                Image(
                    painter = Img,
                    contentDescription = null,
                    modifier = modifier
                        .size(200.dp)

                )
            }

            Column (horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    text = name,
                    modifier = modifier,

                    color = Color.Magenta
                )
                Text(
                    text = titulo,
                    modifier = modifier,
                    color = Color.Magenta
                )
                Text(
                    text = subtitulo,
                    modifier = modifier,
                    color = Color.Magenta
                )
            }

            Column (horizontalAlignment = Alignment.CenterHorizontally ) {
                Text(
                    text = txt,
                    modifier = Modifier,
                    color = Color.Magenta
                )

                Text(
                    text = redes,
                    modifier = Modifier,
                    color = Color.Magenta
                )
                Text(
                    text = email,
                    modifier = Modifier,
                    color = Color.Magenta)
            }


        }


    }





//Lembrar que daqui para paixo é apaenas para vizualisar sem emulador
@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    CartãodeVisitaTheme {
        Apresentacao(
            "Sou Vitoria Ferreira",
            "Desenvolvedora Junior!",
            " Seja Bem vindo",
            "(41)9 9994-4514)",
            "vitoriaferreira@gmail.com",
            "Lindekin"
        )
    }
}
