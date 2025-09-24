fun main(){
    var num = try{
            readln()!!.toInt()
        }
        catch (e: NumberFormatException){
            0
        }

    val msg = when{
        num > 0 && num%2 == 0 -> "Positivo par"
        num > 0 && num%2 != 0 -> "Positivo impar"
        num < 0 -> "Negativo"
        else -> "0"
    }

    println(msg)
}