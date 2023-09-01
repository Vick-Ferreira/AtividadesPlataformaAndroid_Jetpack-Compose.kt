/*comparação tempo de uso smartphone, true 
se no dia atual tiver passado mais tempo do que no ultimo dia se não false*/
fun main() {
    println("Passei mais tempo no telefone hoje: ${compararTempo(300, 250)}")
    println("Passei mais tempo no telefone hoje: ${compararTempo(400, 250)}")
    println("Passei mais tempo no telefone hoje: ${compararTempo(200, 220)}")
    
    

}
fun compararTempo(tempoHoje: Int , tempoOntem: Int) : Boolean{
    return tempoHoje > tempoOntem
    

}
