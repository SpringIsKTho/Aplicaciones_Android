fun main(){
    val num1 = readln()!!.toInt()
    val num2 = readln()!!.toInt()
    val operador = readln()
    when(operador){
        "+" -> println(num1 + num2)
        "-" -> println(num1 - num2)
        "*" -> println(num1 * num2)
        "/" -> println(num1/num2)
        else -> println("Operador desconocido")
    }
}