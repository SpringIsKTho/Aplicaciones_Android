fun main(){
    val x: Int = try{
        readln().toInt()
    }
    catch (e: NumberFormatException){
        0
    }

    val y: Int = try{
        readln().toInt()
    }
    catch (e: NumberFormatException){
        0
    }

    when{
        x>0 && y>0 -> println("Ambos mayores que 0")
        x<0 || y<0 -> println("Uno menor que 0")
        x == 0 && y == 0 -> println("Ambos 0")
        else -> println("Otro")
    }
}