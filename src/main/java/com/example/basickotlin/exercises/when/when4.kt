fun main(){
    var dia = readln()
    when(dia){
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> print("Laborable")
        "Sábado", "Domingo" -> print("Fin de semana")
        else -> print("Día inválido")
    }
}