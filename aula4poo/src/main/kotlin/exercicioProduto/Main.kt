package exercicioProduto

fun main(){

    val produto1 = Produto("Maça", 5.30)
    val produto2 = Produto("Banana", 3.50)
    val produto3 = Produto("Morango", 9.00)

    val estoque = Estoque()
    estoque.adicionar(produto1)
    estoque.adicionar(produto1)
    estoque.adicionar(produto2)
    estoque.adicionar(produto2)
    estoque.adicionar(produto3)

    println("A quantidade total de produtos em estoque é ${estoque.buscarQuantidadeProdutos()}")

    println("O valor total em produtos do estoque é de R$${estoque.calcularValorTotal()}")
}