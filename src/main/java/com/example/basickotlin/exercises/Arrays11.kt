fun main(){
    var numbs =  arrayOf(1, 2, 2, 3, 2, 4)
    var cont = 0
    for(i in 0 until numbs.size){
        if(numbs[i] == 2){
            cont++
        }
    }
    println("veces que aparece el 2: " + cont)
}