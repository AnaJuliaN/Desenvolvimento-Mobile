fun main(args: Array<String>) {

    val carro = Carro()
    carro.marca = "BMW"
    carro.modelo = "x1"
    carro.cor = "Branco"
    carro.ano = 2020

    println("O carro da marca ${carro.marca}, do modelo ${carro.modelo}, é do ano ${carro.ano}")

    carro.acelerar()

    carro.frear()

    val carroEspecial = CarroEspecial()

    carroEspecial.marca = "Volks"
    carroEspecial.modelo = "Gol"
    carroEspecial.cor = "Cinza"
    carroEspecial.ano = 2010
    carroEspecial.acessorios = listOf("Roda 20", "Aerofolio", "Sei lá mais o que")

    carroEspecial.FazerDrift()
}