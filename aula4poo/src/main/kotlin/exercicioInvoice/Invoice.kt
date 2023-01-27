package exercicioInvoice

class Invoice {

    var numeroItem: Int = 0

    var descricaoItem: String = ""

    var quantidadeItem: Int = 0

    var precoItem: Double = 0.0

    constructor(numeroItem: Int, descricaoItem: String, quantidadeItem: Int, precoItem: Double){
        this.numeroItem = numeroItem
        this.descricaoItem = descricaoItem
        this.quantidadeItem = if(quantidadeItem < 0) 0 else quantidadeItem
        this.precoItem = if(quantidadeItem < 0.0) 0.0 else precoItem
    }

    fun getInvoiceAmount(): Double{
        return quantidadeItem * precoItem
    }
}