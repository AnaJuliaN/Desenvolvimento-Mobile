package exercicioLivro

fun main(){

    val livro = Livro()
    livro.setTitulo("Romeu e Julieta")
    livro.setQtdPaginas(534)
    livro.setPagLidas(198)

    livro.verificarProgresso()
}