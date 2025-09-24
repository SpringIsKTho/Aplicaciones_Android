fun main(){
    val st = "Hola"
    val num = 123
    val nu = null
    val boo = true

    check(st)
    check(num)
    check(nu)
    check(boo)
}

fun check (a: Any?) {
    when(a){
        is String -> println("Es String")
        is Int -> println("Es Int")
        null -> println("Es null")
        else -> println("Es otro")
    }

}