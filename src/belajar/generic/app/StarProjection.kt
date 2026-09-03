package belajar.generic.app

fun displayLength(array: Array<*>) {
    println(array.size)
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3)
    val arrayString: Array<String> = arrayOf("a", "b", "c", "B")

    displayLength(arrayInt)
    displayLength(arrayString)
}