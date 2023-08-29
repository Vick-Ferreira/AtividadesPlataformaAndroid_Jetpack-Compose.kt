//EXERCÍCIOS NOÇÃO BÁSICA DE KOTLIN


fun main() {
    val primeiraLinhas = "Use a palavra VAL para variaveis que não podem ser alteradas"
    var segundaLinhas = "Use a palavra VAR para variaveis que podem ser alteradas"
    val terceiraLinhas = "Ao definir uma função, você define os parâmetros que podem ser passados para ela "
    val quartaLinhas = "Ao chamar uma função você passa argumento para os parâmetros"
    println(primeiraLinhas)
    println(segundaLinhas)
    println(terceiraLinhas)
    println(quartaLinhas)
    
    
    
var novaMensagem = 0
novaMensagem ++
    println("Existe $novaMensagem nova mensagem")
    
    var descontoPercentual = 0
    var offer = ""
    val item = "google"
    descontoPercentual = 20
    offer = "sandalia  " + descontoPercentual + "% de desconto e pipoca gratis o dia todo"
    
    println(offer)
    
    
    
    val numeroAdultos = 20
    val numeroCriancas = 30
    val total = numeroAdultos + numeroCriancas
    println(" o numero de pessoas é : " + total)
    
    val salarioBase = 5000
    val salarioBonus = 1000
    val totalSalario = salarioBase + salarioBonus
    println ("você vai receber : " + totalSalario)
    
    
    val primeiroNumero = 10
    val segundoNumero = 20
    val terceiroNumero = 15
    

    val result = primeiroNumero + segundoNumero
    val resultDuol = segundoNumero + terceiroNumero
    
    println(add(a = primeiroNumero , b = segundoNumero = result))
    println(add(a = segundoNumero, b = terceiroNumero = resultDuol))
    
}
 fun add (a: int, b: int): Int {
     val soma = $a + $b
     return "$a\n$b"
 }

