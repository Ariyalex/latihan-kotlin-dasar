package belajar.oop.app

import belajar.oop.data.Car
import belajar.oop.data.Person

fun printAny(any: Any) {
    if (any is Person) {
        println("any adalah person ${any.firstName} ${any.lastName}")
    } else if (any is Car) {

        println("any adalah car ${any.brand} ${any.name}")
    } else {
        println(any)
    }
}

fun printAnyWithWhen(any: Any) {
    when (any) {
        is Person -> println("any adalah person ${any.firstName} ${any.lastName}")
        is Car -> println("any adalah car ${any.brand} ${any.name}")
        else -> println(any)
    }
}

fun printAsString(any: Any) {
    val result = any as String;
    println(result);
}

fun printAsStringSave(any: Any) {
    val result: String? = any as? String;
    println(result)
}

fun main() {

    printAny("Eko")
    printAny(Person("John", "Doe"))
    printAny(Car("Toyota", "Inova"))
    printAnyWithWhen(Car("Toyota", "Inova"))
    printAnyWithWhen(Car("Toyota", "Inova"))

    printAsString("Hello")
//    printAsString(1) //pasti error
    printAsStringSave("Testing save ")
    printAsStringSave(0)

}