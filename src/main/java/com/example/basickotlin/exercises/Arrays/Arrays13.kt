fun main(){
    var dias = arrayOfNulls<String>(5)
    var diasc = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes")
    for(i in 0 until dias.size){
        dias[i] = diasc[i]
    }
    println(dias.toList())
}