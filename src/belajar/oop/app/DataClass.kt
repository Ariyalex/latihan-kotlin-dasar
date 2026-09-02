package belajar.oop.app

import belajar.oop.data.Product

fun main() {
    val indomie: Product = Product("Indomie", 3000, "mie instant");
    val sarimie: Product = indomie.copy(name = "Sarimie")

    println(indomie)
    println(sarimie)
}