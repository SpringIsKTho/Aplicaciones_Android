fun main(){
    val persona = mapOf("nombre" to "Ana", "edad" to 30,
        "ciudad" to "Madrid")
    for ((i, j) in persona){
        println("$i -> $j")
    }
}