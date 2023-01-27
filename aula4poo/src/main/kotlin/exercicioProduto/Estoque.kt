package exercicioProduto

class Estoque: IProdutos {

    private var listaProdutos: MutableList<Produto> = mutableListOf()

    override fun adicionar(produto: Produto) {
        listaProdutos.add(produto)
    }

    override fun buscarQuantidadeProdutos(): Int {
        return listaProdutos.size
    }

    override fun calcularValorTotal(): Double {
        return listaProdutos.sumOf { it.preco }
    }
}


