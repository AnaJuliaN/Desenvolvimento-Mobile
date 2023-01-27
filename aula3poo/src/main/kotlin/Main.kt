fun main(args: Array<String>) {

    val contaCorrente = BancoContaCorrente()
    contaCorrente.nome = "Santander"
    contaCorrente.agencia = "0001"
    contaCorrente.conta = "1111-1"
    contaCorrente.imprimirSaldoAtual()
    contaCorrente.depositar(500.0)
    contaCorrente.imprimirSaldoAtual()
    contaCorrente.sacar(200.0)
    contaCorrente.imprimirSaldoAtual()

    println("-----------------------------------------------------------------------------------------------")

    val contaPoupanca = BancoContaPoupanca()
    contaPoupanca.nome = "Nubank"
    contaPoupanca.agencia = "0002"
    contaPoupanca.conta = "2222-2"
    contaPoupanca.imprimirSaldoAtual()
    contaPoupanca.depositar(10000.0)
    contaPoupanca.imprimirSaldoAtual()
    contaPoupanca.sacar(2400.0)
    contaPoupanca.imprimirSaldoAtual()

}