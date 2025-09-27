fun main(){
    val temp = readln().toInt()
    when{
        temp < 0 -> println("Congelado")
        temp in 0..15 -> println("Frío")
        temp in 16..25 -> println("Templado")
        temp > 25 -> println("Calor")
        else -> println("No existe")
    }
}