package exercicioLanchonete

interface IPrato {
    fun calcularPreco(): Double
    fun calcularTaxa(): Double
    fun duasCarnes(): Double
    fun bordaPizza(): Double
    fun catupirySalgadinho(): Double
    fun adicionar(prato: Prato)
}