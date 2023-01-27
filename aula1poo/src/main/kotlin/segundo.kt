fun main(args: Array<String>) {

    val usuario = Usuario("Ana", "ana@gmail.com", "123456")

    println("Digite seu email:")
    val email = readln()

    println()

    println("Digite sua senha:")
    val senha = readln()

    println()

    if(email == usuario.email && senha == usuario.senha){
        println("${usuario.nome}, seu login foi realizado com sucesso!")
    } else{
       println("Login incorreto, tente novamente.")

    }
}