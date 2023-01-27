package exercicioFuncionario

fun main(){
     val funcionario = Funcionario()
    funcionario.nome = "Luis"
    funcionario.sobrenome = "Silva"
    funcionario.horasTrabalhadas = 10
    funcionario.valorPorHora = 25.5

    funcionario.getFullName()
    funcionario.calculateSallary()
    funcionario.incrementHours(8)
    funcionario.calculateSallary()
}