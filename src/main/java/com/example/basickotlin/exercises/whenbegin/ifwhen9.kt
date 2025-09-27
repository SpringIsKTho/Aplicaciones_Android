import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    var puerta = true;
    while (puerta) {
        println("1. Saludar")
        println("2. Mostrar hora actual")
        println("3. Salir")

        val op = readln().toInt()
        when (op) {
            1 -> println("Hola usuario")
            2 -> println(java.time.LocalTime.now())
            3 -> puerta = false
            else -> println("Opción no válida")
        }
    }
    println("Terminando programa")
}