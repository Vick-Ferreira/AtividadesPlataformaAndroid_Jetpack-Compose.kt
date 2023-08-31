package com.example.quadrantescompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantescompose.ui.theme.QuadrantesComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantesComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrantes()
                }
            }
        }
    }
}

@Composable
fun Quadrantes(titulo: String, texto: String, modifier: Modifier = Modifier) {

    Column (
        modifier = Modifier

    ) {

        Row(modifier = Modifier.weight(1f)) { // estamos chamando a função fillMaxWidth LARGURA

            Column(
                modifier = Modifier
                    .fillMaxHeight() //Dessa forma, a Column ocupará todo o espaço vertical dentro da Row
                    .weight(1f)//aqui estamos colocando um peso em cada coluna, ALTURA
                    .background(color = Color(0xFFEADDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally




                ) {


                Text(
                    text = titulo,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp),
                    fontWeight = FontWeight.Bold,


                    )
                Text(
                    text = texto,
                    modifier = modifier,
                    textAlign = TextAlign.Center
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFD0BCFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally



                ) {


                Text(
                    text = titulo,

                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        ),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = texto,
                    modifier = modifier,
                    textAlign = TextAlign.Center
                )

            }


        }
        Row(modifier = Modifier.weight(1f)


        ) { // estamos chamando a funçao fillMaxWidth

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f) //aqui estamos colocando um peso em cada coluna
                    .background(color = Color(0xFFB69DF8))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally




                ) {


                Text(
                    text = titulo,
                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        ),
                    fontWeight = FontWeight.Bold,

                    )
                Text(
                    text = texto,
                    modifier = modifier,
                    textAlign = TextAlign.Center
                )

            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = Color(0xFFF6EDFF))
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally



                ) {


                Text(
                    text = titulo,

                    modifier = modifier
                        .padding(
                            bottom = 16.dp
                        ),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = texto,
                    modifier = modifier,
                    textAlign = TextAlign.Center
                )

            }


        }
    }


}



@Preview(showBackground = true)
@Composable
fun Quadrantes() {
    QuadrantesComposeTheme {
        Quadrantes("Text composable", "Displays text and follows the recommended Material Design guidelines.")
    }
}
