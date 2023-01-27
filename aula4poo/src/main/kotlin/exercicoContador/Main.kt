package exercicoContador

fun main(){

    val contador = Contador()

    contador.incremet()

    println(contador.getCountValue())

    contador.incremet()

    println(contador.getCountValue())

    contador.reset()

    println(contador.getCountValue())
}
