package exercicioFuncionario

class Funcionario {

    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Int = 0
    var valorPorHora: Double = 0.0

    fun getFullName(){
       println("$nome $sobrenome")
    }

    fun calculateSallary(){
        val calculo = valorPorHora * horasTrabalhadas
        println("O salario é de $calculo")
    }

    fun incrementHours(horas: Int){
        horasTrabalhadas += horas
    }
}