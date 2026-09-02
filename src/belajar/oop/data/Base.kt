package belajar.oop.data

interface Base {
    fun sayHello(name: String);
    fun sayGoodBye(name: String)
}

class BaseImpl : Base {
    override fun sayHello(name: String) {
        println("Hello, my name is $name")
    }

    override fun sayGoodBye(name: String) {
        println("good by $name")
    }
}

class Delegation(val base: Base) : Base by base;