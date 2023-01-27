abstract class Banco {
    var nome: String = ""
    var agencia: String = ""
    var conta: String = ""
    abstract var valorTotal: Double

    abstract fun imprimirSaldoAtual()
}