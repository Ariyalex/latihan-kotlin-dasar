package belajar.collection

fun main() {
    val ibuKota = mapOf<String, String>("Indonesia" to "Jakarta", "Jepang" to "Tokyo", "Amerika" to "New York")


    ibuKota.forEach {
        println("Ibukota ${it.key} adalah ${it.value}")
    }
}