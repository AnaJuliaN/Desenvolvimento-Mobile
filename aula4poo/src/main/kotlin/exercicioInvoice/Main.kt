package exercicioInvoice

fun main(){

    val invoice = Invoice(123, "Celular", 3, 3000.5)

    val amount = invoice.getInvoiceAmount()

    println("O Valor da fatura de ${invoice.descricaoItem} é de R$$amount")
}