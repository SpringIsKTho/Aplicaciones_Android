fun main(){
    var num = try{
        readln()!!.toInt()
    }
    catch (e: NumberFormatException){
        0
    }

    when{
        num in 0..50 -> println("Bajo")
        num in 51..100 -> println("Medio")
        num > 100 -> println("Alto")
        num < 0 -> println("Negativo")
    }
}