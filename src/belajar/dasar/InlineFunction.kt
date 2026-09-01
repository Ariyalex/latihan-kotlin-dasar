package belajar.dasar

inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    println(hello({ "Ariya" }, { "Duta" }));
    println(hello({ "Ariya" }, { "Duta" }));
    println(hello({ "Ariya" }, { "Duta" }));
}