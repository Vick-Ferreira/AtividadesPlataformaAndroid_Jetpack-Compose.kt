package com.example.excercicio_artigoscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.vector.VectorProperty
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.excercicio_artigoscompose.ui.theme.Excercicio_ArtigosComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Excercicio_ArtigosComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImgTop()
                }
            }
        }
    }
}

@Composable
fun TxtPrincipal(titulo: String, subtitulo: String, texto: String, modifier: Modifier = Modifier){


        Column {
            Text(
                text = titulo,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp)
            )
            Text(
                text = subtitulo,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp),
                textAlign = TextAlign.Justify

            )

            Text(
                text = texto,
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Justify

            )
        }
    }


@Composable
fun ImgTop( modifier: Modifier = Modifier){
val imagem = painterResource(R.drawable.compose)
 Column (modifier = modifier,
     verticalArrangement = Arrangement.Center){


    Image(
        painter = imagem,
        contentDescription = null,
                modifier = Modifier.fillMaxWidth()
    )


        TxtPrincipal(
            titulo = "Jet Compose Tutorial",
            subtitulo = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            texto = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",

    )
}
}
    @Preview(showBackground = true)
    @Composable

    fun ImgTop() {
        Excercicio_ArtigosComposeTheme {
           ImgTop(Modifier)
        }
    }
