fun main(){
    var lista5 = mutableListOf<Int>()
    val lista =  listOf(2, 6, 8, 1, 9)

    for(i in 0 until lista.size){
        if (lista[i]>5) lista5.add(lista[i])
    }

    println(lista5.toString())
}