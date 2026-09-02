package belajar.oop.app

import belajar.oop.data.Application
import belajar.oop.data.Utils

fun main() {
    println(Utils.name)
    println(Utils.toUpperCase("random"))

//    dua cara memanggil companion object
    Application.Companion.printApplication()
    Application.printApplication()
}