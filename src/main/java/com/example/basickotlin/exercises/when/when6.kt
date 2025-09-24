fun main(){
    var let = readln()
    val letc: Char = let[0]
    var puerta = false

    when{
        letc == 'a' || letc == 'e' || letc == 'i' || letc == 'o' || letc == 'u' -> println("Vocal minúscula")
        letc == 'A' || letc == 'E' || letc == 'I' || letc == 'O' || letc == 'U' -> println("Vocal mayúscula")
        letc in 'a'..'z' || letc in 'A'..'Z' -> println("Consonante")
        else -> println("Otro")
    }
}