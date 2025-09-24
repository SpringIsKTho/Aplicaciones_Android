fun main(){
    var btn = readln()
    var accion = when(btn){
        "btn1" -> "Guardar"
        "btn2" -> "Cancelar"
        "btn3" -> "Eliminar"
        else -> "Botón no válido"
    }

    println(btn)
}