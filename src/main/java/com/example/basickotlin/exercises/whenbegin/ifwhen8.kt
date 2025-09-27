fun main(){
    val num = readln().toInt()
    when{
        num%3 == 0 && num%5 == 0 -> println("Multiplo de 3 y 5")
        num%3 == 0 -> println("Multiplo de 3")
        num%5 == 0 -> println("Multiplo de 5")
        else -> println("Ninguno")
    }
}