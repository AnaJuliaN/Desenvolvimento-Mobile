package exercicioLanchonete

abstract class Prato {
    var nome:String = ""
    var preco:Double = 0.0
    var precoAdicional:Double = 0.0

    fun Prato(nome:String, preco:Double, precoAdicional:Double){
        this.nome = nome
        this.preco = preco
        this.precoAdicional = precoAdicional
    }

    fun getNome(): String{
        return nome
    }

    fun setNome(nome: String){
        this.nome = nome
    }

    fun getPreco(): Double{
        return preco
    }

    fun setPreco(preco: Double){
        this.preco = preco
    }

    fun getPrecoAdicional(): Double{
        return precoAdicional
    }

    fun setPrecoAdicional(precoAdicional: Double){
        this.precoAdicional = precoAdicional
    }

}