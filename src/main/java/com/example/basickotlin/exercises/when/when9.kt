open class Animal

class Perro : Animal()
class Gato : Animal()
class Pajaro : Animal()

fun identificarAnimal(animal: Animal) {
    when (animal) {
        is Perro -> println("Es un perro")
        is Gato -> println("Es un gato")
        is Pajaro -> println("Es un pájaro")
        else -> println("Otro animal")
    }
}

fun main() {
    val perro = Perro()
    val gato = Gato()
    val pajaro = Pajaro()
    val lagarto = Animal()

    identificarAnimal(perro)
    identificarAnimal(gato)
    identificarAnimal(pajaro)
    identificarAnimal(lagarto)
}