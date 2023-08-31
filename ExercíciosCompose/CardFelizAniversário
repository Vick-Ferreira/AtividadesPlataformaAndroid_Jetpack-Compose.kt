package com.example.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaycard.ui.theme.HappyBirthdayCardTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CombinavelImagem("Feliz Aniversário ", "From Vitoria")

                }
            }
        }
    }
}
//adicionando um nova função . add anotação antes da função, pois ela sera uma função combinavel descrevendo um elemento combinável Text.
@Composable
fun SaudacaoText(mensagem: String,from: String, modifier: Modifier = Modifier){   //vamos adicionar um parametro - é uma boa pratica que a função aceite e transmita o modifier para o filho

    Column (//transmitir o parametro modificador
        verticalArrangement = Arrangement.Center, //centralizar saudação

        modifier = modifier
    ){ //tudo está dentro do column

            Text(
                text = mensagem, //add função combinavel TEXT transmite mensagem de texto como um ArgumetoS nomeado, puxando parametro.
                fontSize = 60.sp,
                lineHeight = 100.sp, //altura linha
                textAlign = TextAlign.Center


                )



            Text(
                text = from,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)

            )

    }


}

@Composable
fun CombinavelImagem(mensagem: String, from: String, modifier: Modifier = Modifier) {


        val imagem = painterResource(R.drawable.pessoas)
        Box  {
            Image(
                painter = imagem,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                alpha = 0.5F
            )

            SaudacaoText(
                mensagem = "Feliz Aniversário",
                from = "Vitoria Ferreira",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                )





    }}







@Preview( showBackground = true)
@Composable
fun CombinavelImagem() {
    HappyBirthdayCardTheme { //temos que chamar outra função aqui dentro para a prévia ser mostrada
        CombinavelImagem("Feliz Aniversário Vitoria", "From Emma")

    }
}
