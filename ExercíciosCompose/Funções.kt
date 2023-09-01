
fun main() {
    var cardTotal = 0
    cardTotal = cardTotal + 5
    println("Total: $cardTotal")
    cardTotal++
    println("total: $cardTotal")
    cardTotal++
    println("total: $cardTotal")
    cardTotal++
    println("total: $cardTotal")
    cardTotal++
    println("total: $cardTotal")
    cardTotal--
    println("total: $cardTotal")
    cardTotal--
    println("total: $cardTotal")
    cardTotal--
    println("total: $cardTotal")
    cardTotal--
    println("total: $cardTotal")
    
    val trip1 = 3.20
    val trip2 = 5.10
    val trip3 = 1.75
    val totalTrip = trip1 + trip2 + trip3
    
    println("Total trip = $totalTrip")
    
    val compromisso = "Reunião:"
    val date = " 1 de janeiro"
    val concatenacao = compromisso + date + " no trabalho"
    println(concatenacao)

    
    println("vic \"olá\"")
    
    val notificacaoAtivada = true
    println(notificacaoAtivada)
    
    
   /* 1- função main chamando outra função fora dela que já tem seu proprio conteudo -> aniversario()
  *  2- podemos também fazer assim para retornar uma string, com uma função, usamos o return e no main criamos uma val para receber a função criada 
  *    e a saida fica como println no main -> val criacao = aniversario() println(criacao)
  * 3- podemos também colocar a função direto na  função de saida println, no main.
  */ 
    println(aniversario())
    println(ganhador("Marcos" , 50 , 25 ))//  argunto que é tranmitido "NOME USUARIO"*/
    println(ganhador( name = "Antonio" , num =  100 , idade = 25)) //observe que estou usando uma função apenas para diferentes dados serem impressos
}

fun aniversario(): String {
   val felicitacoes = "Parabéns Vitoria"
   val parabens = "Feliz Aniversário"
   return "$felicitacoes\n$parabens"
    
   
}


//vamos agora fazer com que eu consiga dar os parabéns não apenas há vitoria e sim para qualquer pessoae e quando precisar add parametro na fun.

fun ganhador(name: String, num: Int, idade: Int): String{ //(nome do paramentro:parametro): tipo
    val usuario = "Parabéns $name!"/* preciso transmitir uma sting, quando chamo um paramentro.
                                    *Quando chamamos uma função que exista um paramento um argumento  é tranmitido "NOME DO USUARIO" incluir no main*/
    val ganhou = "você ganhou $num"
    
    val idade = "voce tem $idade"
    return "$usuario\n$ganhou\n$idade" // não esquecer de add todos os paramentos e val criadas no return
}
