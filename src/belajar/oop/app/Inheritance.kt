package belajar.oop.app

import belajar.oop.data.Manager
import belajar.oop.data.VicePresident

fun main() {
    val manager = Manager("Patrick")
    val vicePresident = VicePresident("John")

    manager.sayHello("Eko")
    vicePresident.sayHello("Prince")
}