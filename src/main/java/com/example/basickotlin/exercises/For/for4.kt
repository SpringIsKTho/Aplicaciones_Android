fun main(){
    val numeros = listOf(3, 7, 9, 10, 15, 20)
    for(i in 0 until numeros.size){
        if (numeros[i] > 10){
            println("El primer numero mayor que 10 es ${numeros[i]}")
            break
        }
    }
}