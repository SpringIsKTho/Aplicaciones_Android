fun main(){
    val n = try {
        readln()!!.toInt()
    }
    catch (e: NumberFormatException){
        println("El numero es nulo o hay otro error")
        0
    }

    println(n)
}