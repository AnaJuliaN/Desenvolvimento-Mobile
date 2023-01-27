fun main(args: Array<String>) {

    val quadrado = Quadrado()
    quadrado.lado = 10
    println("A area do quadrado é ${quadrado.calcularArea()}")

    val retangulo = Retangulo()
    retangulo.base = 15
    retangulo.altura = 7
    println("A area do retangulo é ${retangulo.calcularArea()}")

    val triangulo = Triangulo()
    triangulo.base = 8
    triangulo.altura = 22
    println("A area do triangulo é ${triangulo.calcularArea()}")

}