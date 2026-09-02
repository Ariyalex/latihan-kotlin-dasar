package belajar.oop.app

import belajar.oop.data.BaseImpl
import belajar.oop.data.Delegation

fun main() {
    val base = BaseImpl();

    val delegation = Delegation(base);

    delegation.sayHello("Ariya")
    delegation.sayGoodBye("Ariya")
}