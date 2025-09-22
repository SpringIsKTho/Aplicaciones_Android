fun main(){
    var num = arrayOf(10, 20, 30, 40)
    println("Dame un numero")
    var leer = try {
        readLine()!!.toInt()
    }
    catch (e: NumberFormatException){
        0
    }
    var bool = false
    for(i in 0 until num.size){
        if(num[i] == leer){
            println("Posicion encontrada: " + (i+1))
            bool = true
        }
    }

    if (!bool){
        println("El numero no existe en el array")
    }

}