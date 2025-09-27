fun main(){
    var nota = readln().toInt()
    when{
        nota in 9..10 -> println("Sobresaliente")
        nota in 7..8 -> println("Notable")
        nota in 5..6 -> println("Aprobado")
        nota < 5 -> println("Suspenso")
        else -> println("Nota no existe")
    }
}