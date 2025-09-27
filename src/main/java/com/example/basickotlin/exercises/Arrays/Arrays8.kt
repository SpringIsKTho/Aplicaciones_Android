fun main(){
    var dia = arrayOf("lunes", "martes", "miércoles", "jueves", "viernes")
    var aid = arrayOfNulls<String>(5)
    var cont: Int = 4
    for(i in 0 until dia.size){
        aid[i] = dia[cont]
        cont--
    }
    println(dia.toList())
    println(aid.toList())
}