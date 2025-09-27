fun main(){
    var letra = arrayOf('a', 'b', 'c', 'd')
    println(letra.joinToString())
    letra[1] = 'z'
    println(letra.joinToString())
}