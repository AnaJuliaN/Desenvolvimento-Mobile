class BancoContaPoupanca: Banco(), AcoesBanco {
    override var valorTotal: Double = 3000.0

    override fun imprimirSaldoAtual() {
        println("O saldo atual da conta poupanca $conta - $agencia, do Banco $nome é de R$$valorTotal")
    }

    // Rendimento de 0,5%
    override fun depositar(valor: Double) {
        valorTotal += valor
        valorTotal += (valorTotal * 0.05)
    }

    // Taxa de 0,7%
    override fun sacar(valor: Double) {
        val taxa = valor * 0.07
        valorTotal -= valor
        valorTotal =- taxa
    }
}