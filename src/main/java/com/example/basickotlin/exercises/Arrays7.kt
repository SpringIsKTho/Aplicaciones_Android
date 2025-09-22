import kotlin.math.pow

fun main(){
    var num = intArrayOf(1, 2, 3, 4, 5)
    var num2 = arrayOfNulls<Int>(5)
    num.forEach {
        i -> num2[i-1] = num[i-1].toDouble().pow(2).toInt()
    }
    println(num2.toList())
}