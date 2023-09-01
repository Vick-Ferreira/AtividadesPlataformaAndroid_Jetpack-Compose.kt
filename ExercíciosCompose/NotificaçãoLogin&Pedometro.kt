//Notificação de login GMAIL

fun main() {
  
    
    println(alertaMensagem("Chrome" , "vitoriaferreirap06@gmail.com"))
    println(alertaMensagem("windows" , "aaaa@hotmail.com"))
    
//pedometro

    val passos = 4000
    val caloriaPerdida = pesoCalorias(passos);
    println("andar $passos passos queima  $caloriaPerdida clorias")
}

fun alertaMensagem(sistema: String, email: String): String {
    
    val operacao = " há uma nova conta de login no : $sistema"
    val conta = "na sua conta de e-mail : $email"
    return "$operacao\n$conta"
    }
    
    //pedometro
   
fun pesoCalorias(peso: Int) : String {
    val caloria = 0.04
    val totalCalorias = peso * caloria
    return "$totalCalorias"

}
