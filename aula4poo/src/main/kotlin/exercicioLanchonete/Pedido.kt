package exercicioLanchonete

abstract class Pedido: IPrato {

    var nomeCliente: String = ""
    var taxaServico: Double = 0.1
    private var itensConsumidos: MutableList<Prato> = mutableListOf()

    override fun adicionar(prato: Prato) {
        itensConsumidos.add(prato)
    }

    override fun calcularTaxa(): Double {
        var somaItens = 0.0
        for(prato in itensConsumidos){
            somaItens += calcularPreco()
        }
        return somaItens * 0.1
    }

    override fun duasCarnes(): Double {
        var somaLanche = 0.0
        somaLanche = calcularPreco() + 10.0
        return somaLanche

    }

    override fun bordaPizza(): Double {
        var somaPizza = 0.0
        somaPizza = calcularPreco() + 5.0
        return somaPizza
    }

    override fun catupirySalgadinho(): Double {
        var somaSalgadinho = 0.0
        somaSalgadinho = calcularPreco() + 2.5
        return somaSalgadinho
    }

    fun notaFiscal(): Double{
        println("----Nota Fiscal-----")
        println("Itens consumidos:")
        var valorFinal = 0.0
        for(Prato in itensConsumidos){
            valorFinal += calcularPreco()
        }
        println("Valor final a pagar:$valorFinal")
        println("A taxa de serviço é:" + calcularTaxa())
        println("--------Fim---------")
        return valorFinal
    }


}