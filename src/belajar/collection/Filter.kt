package belajar.collection

fun main() {
    val angka = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val filter: List<String> = angka.filter {
        it > 2
    }.map { it.toString() }


    println(filter)
}