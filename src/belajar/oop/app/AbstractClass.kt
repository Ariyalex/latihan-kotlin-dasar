package belajar.oop.app

import belajar.oop.data.*

fun main() {
    val province: Location = Province("Yogyakarta")
    val city: Location = City("Sleman")
//    val location = Location("error ini nih") // ini akan error karena Location merupakan abstract class

    println(province.name)

    val cat: Animal = Cat();
    val dog: Dog = Dog();

    dog.eat()
    dog.walk()
    cat.walk()

    cat.name = "Richard"
    cat.eat()

    println(cat.name)

    println(dog.upper)
    dog.bark()
}