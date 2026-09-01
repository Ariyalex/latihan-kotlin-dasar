package belajar.dasar

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val result = transformer(name);
        return result;
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "KOSONG";
        } else {
            return value.uppercase();
        }
    }

    println(hello("Ariya Duta", upper));

    println(hello("Ariya Duta", fun(value: String): String {
        if (value == "") {
            return "KOSONG";
        } else {
            return value.uppercase();
        }
    }))
}