fun main(){
    var edad = readln().toInt()
    when(edad){
        in 0..2 -> println("Bebé")
        in 3..12 -> println("Niño")
        in 13..17 -> println("Adolescente")
        in 18..64 -> println("Adulto")
        else -> println("Mayor")
    }
}