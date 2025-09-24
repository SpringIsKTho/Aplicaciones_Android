fun main(){
    val nom = listOf<String>("Alejandro", "Carlos", "Diego", "Javier", "Luis",
        "Mateo", "Nicolás", "Pablo", "Rodrigo", "Tomás",
        "Ana", "Beatriz", "Camila", "Daniela", "Elena",
        "Fernanda", "Gabriela", "Isabel", "Laura", "Sofía",
        "Alex", "Sam", "Taylor", "Jordan", "Chris",
        "Ariel", "Morgan", "Robin", "Casey", "Jamie")

    for (i in 0 until nom.size){
        when(nom[i].length){
            in 0..4 -> println("Nombre corto")
            in 5..7 -> println("Nombre mediano")
            else -> println("Nombre grande")
        }
    }
}