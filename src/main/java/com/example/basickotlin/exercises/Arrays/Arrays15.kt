fun main(){
    var numb = arrayOf(1, 2, 3, 4, 5)
    var numnew = arrayOfNulls<Int>(4)
    var cont: Int = 0
    for(i in 0 until numb.size){
        if(numb[i] != 3){
            numnew[cont] = numb[i]
            cont++
        }
    }
    println(numnew.toList())
}