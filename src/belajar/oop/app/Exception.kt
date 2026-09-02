package belajar.oop.app

import belajar.oop.data.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name cannot be blank")
    } else {
        println("Hello, $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Kurniawan")
        validateAndSayHello("")

    } catch (e: ValidationException) {
        println("error ${e.message}")
    } finally {
        println("finally ini, seperti biasa")
    }
}