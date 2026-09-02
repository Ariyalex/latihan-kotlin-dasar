package belajar.oop.app

import belajar.oop.data.Minus
import belajar.oop.data.Modulo
import belajar.oop.data.Operation
import belajar.oop.data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when (operation) {
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
        is Plus -> value1 + value2
    }
}

fun main() {
    println(operation(10, 5, Plus()))
    println(operation(10, 5, Minus()))
    println(operation(10, 5, Modulo()))
}