package belajar.dasar

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase();
    }
    return this.lowercase();
}

fun main() {
    val result = "Ariya Duta" to "UP";
    println(result);
}