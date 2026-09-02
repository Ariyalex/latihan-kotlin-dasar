package belajar.oop.app

import belajar.oop.data.Action

fun fireAction(action: Action) {
    action.action();
}

fun main() {
    fireAction(object : Action {
        override fun action() {
            println("pengimplementasian anonymous class")
        }
    })
    fireAction(object : Action {
        override fun action() {
            println("nggak tau isinya apa")
        }
    })
}