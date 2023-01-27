class BancoContaCorrente: Banco(), AcoesBanco {
    override var valorTotal: Double = 2000.0

    override fun imprimirSaldoAtual() {
        println("O saldo atual da conta corrente $conta - $agencia, do Banco $nome é de R$$valorTotal")
    }

    override fun depositar(valor: Double) {
        valorTotal += valor
    }

    override fun sacar(valor: Double) {
        valorTotal -= valor
    }
}