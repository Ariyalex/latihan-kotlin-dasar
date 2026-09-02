package belajar.oop.app

import belajar.oop.data.Application


typealias App = belajar.oop.data.Application // bisa langsung import di sini
typealias Aplikasi = Application //atau bisa seperti ini

typealias stringSupplier = () -> String;

fun sayHello(supplier: stringSupplier) {
    println(supplier())
}

fun main() {
    sayHello { "Testing typealias on function" }
}