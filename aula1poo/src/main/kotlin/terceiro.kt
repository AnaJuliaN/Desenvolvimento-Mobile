fun main(args: Array<String>) {

    val produto1 = Produto("Maça", "10.99")
    val produto2 = Produto("Banana", "12.50")
    val produto3 = Produto("Tâmara", "30.00")

    var valorTotal = 0.0
    val carrinhoCompras: MutableList<Produto> = mutableListOf()
    carrinhoCompras.add(produto1)
    carrinhoCompras.add(produto2)
    carrinhoCompras.add(produto3)

    for(produto in carrinhoCompras){
        println("${produto.nome} - ${produto.preco}")
        valorTotal += produto.preco
    }

    println("O valor total da compra é: $valorTotal")
}


