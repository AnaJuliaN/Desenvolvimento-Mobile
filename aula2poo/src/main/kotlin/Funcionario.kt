open class Funcionario (nome: String, salario: Double){
    var nome: String
    var salario: Double

    init{
        this.nome = nome
        this.salario = salario
    }

    private fun calcularBonus(bonus: Double): Double{
        return salario * bonus
    }

    open fun calcularSalarioFinal(bonus: Double): Double{
        return salario + (calcularBonus(bonus))
    }
}