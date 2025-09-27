fun main(){
    var nombres = arrayOf("Ana", "Luis", "Eva", "Pablo")
    println("Dame un nombre")
    var lectura = readLine()
    var puerta = false
    for (i in 0 until nombres.size){
        if(nombres[i].equals(lectura)){
            println("Nombre encontrado en posicion: " + (i+1))
            puerta = true
        }
    }
    if (!puerta){
        println("Nombre no econtrado")
    }
}