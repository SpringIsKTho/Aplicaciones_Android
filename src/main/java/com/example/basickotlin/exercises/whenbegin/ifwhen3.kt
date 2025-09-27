fun main(){
    var valor = readln()
    val cvalor : Char = valor[0]
    when (cvalor){
        'a', 'e', 'i', 'o', 'u' -> println("Vocal")
        in 'a'..'z' -> println("Consonante")
        else -> ("Otro")
    }
}