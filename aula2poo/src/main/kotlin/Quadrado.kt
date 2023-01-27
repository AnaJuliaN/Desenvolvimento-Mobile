class Quadrado: FiguraGeometrica() {
    var lado = 0

    override fun calcularArea(): Int {
        return lado * lado
    }
}