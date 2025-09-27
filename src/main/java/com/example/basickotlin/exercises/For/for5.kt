fun main(){
    val valores = arrayOf(5, 10, 15, 20)
    var suma = 0
    for(i in 0 until valores.size){
        suma = suma + valores[i]
    }
    println("Suma: $suma")
}