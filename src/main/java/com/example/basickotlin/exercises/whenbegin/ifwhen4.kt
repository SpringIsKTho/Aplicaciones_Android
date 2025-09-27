fun main(){
    val a: Any = readln()
    when(a){
        is String -> println(a.length)
        is Int -> println(a*2)
        is Boolean -> println("Es " + a)
        else -> println("No reconocido")
    }
}