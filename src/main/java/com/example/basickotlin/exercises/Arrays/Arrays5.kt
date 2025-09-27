fun main(){
    var num = intArrayOf(10, 5, 22, 7, 1, 8)
    var max = 0
    var min = num[0]
    for(i in 0 until num.size){
        if(num[i]>max){
            max = num[i]
        }
        if(num[i]<min){
            min = num[i]
        }
    }
    println("max: " + max)
    println("min: " + min)
    println("diff: " + (max-min))
}