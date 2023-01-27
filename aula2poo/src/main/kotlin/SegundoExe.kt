fun main(args: Array<String>) {

    val gerente = Gerente("Ana", 20000.0)
    val salarioGerente = gerente.calcularSalarioFinal(0.4)
    println("Funcionario ${gerente.nome} teve um salario + bonus de R$${salarioGerente}")

    val programador = Programador("Joao", 15000.0)
    val salarioProgramador = gerente.calcularSalarioFinal(0.25)
    println("Funcionario ${programador.nome} teve um salario + bonus de R$${salarioProgramador}")

}