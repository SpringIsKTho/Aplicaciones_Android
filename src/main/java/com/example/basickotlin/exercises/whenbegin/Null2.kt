fun main(){
    val n: Int? = 5
    n?.let {
        println("El valor es ${it*2}")
    }
}