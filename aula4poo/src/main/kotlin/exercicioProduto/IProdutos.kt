package exercicioProduto

interface IProdutos {
    fun adicionar(produto: Produto)
    fun buscarQuantidadeProdutos(): Int
    fun calcularValorTotal(): Double
}