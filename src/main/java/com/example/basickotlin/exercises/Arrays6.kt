import android.R

fun main(){
    var num = arrayOf(2, 5, 8, 11, 14, 17)
    var cont: Int = 0
    for(i in 0 until num.size){
        if(num[i]%2 == 0){
            cont++
        }
    }
    var pares = arrayOfNulls<Int>(cont)
    cont = 0
    for(i in 0 until num.size){
        if(num[i]%2 == 0){
            pares[cont] = num[i]
            cont++
        }
    }
    println(pares.toList())
}