fun main() {
    println("dame un numero")
        var num: Int = 0
    num = try {
        readLine()!!.toInt()
    }catch (e: NumberFormatException){
        0
    }

        if (num == 0) {
            println("Es 0")
        } else if (num % 2 == 0) {
            println("$num Es par")
        }
        else{
            println("Es impar")
        }
}