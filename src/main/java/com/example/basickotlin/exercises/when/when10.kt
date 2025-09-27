fun main() {
    val edades = listOf(13, 12, 10, 18, 24, 76, 32, 7, 27, 87, 15, 9, 2)
    var mayor = mutableListOf<Int>()
    var nino = mutableListOf<Int>()
    var adulto = mutableListOf<Int>()
    var adolescente = mutableListOf<Int>()

    edades.forEach { i ->
        when(i){
            in 0..12 -> nino.add(i)
            in 13..17 -> adolescente.add(i)
            in 18..64 -> adulto.add(i)
            in 65..100000 -> mayor.add(i)
        }
    }

    println("Niños: " + nino.toString())
    println("Adolescentes: " + adolescente.toString())
    println("Adultos: " + adulto.toString())
    println("Mayores: " + mayor.toString())
}


