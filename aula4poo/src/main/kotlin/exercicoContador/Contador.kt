package exercicoContador

class Contador {

    private var count: Int = 0

    fun reset(){
        count = 0
    }

    fun incremet(){
        count += 1
    }

    fun getCountValue(): Int{
        return count
    }
}