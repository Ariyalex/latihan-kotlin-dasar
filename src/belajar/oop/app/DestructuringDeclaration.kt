package belajar.oop.app

import belajar.oop.data.Game
import belajar.oop.data.Login
import belajar.oop.data.MinMax

fun minMax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value2, value1)
        value1 < value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    var game = Game("GTA", 100)

    val (name, price) = game;
    println(name)
    println(price)

    val (min, max) = minMax(10, 100);
    println(min)
    println(max)

    val userLogin = Login("Ariya", "Ariya123")
    login(userLogin) { (username, password) -> username == "Ariya" && password == "Ariya123" }

}