package exercicioLivro

import jdk.nashorn.internal.runtime.regexp.joni.ast.QuantifierNode

class Livro {

    private var titulo: String = ""
    private var quantidadePaginas: Int = 0
    private var paginasLidas: Int = 0

    fun setTitulo(titulo: String){
        this.titulo = titulo
    }

    fun setQtdPaginas(quantidadePaginas: Int){
        this.quantidadePaginas = quantidadePaginas
    }

    fun setPagLidas(paginasLidas: Int){
        this.paginasLidas = paginasLidas
    }

    fun verificarProgresso(){
        val porcentagemLida = (paginasLidas * 100) / quantidadePaginas
        println("Você já leu $porcentagemLida% do livro $titulo")
    }
}