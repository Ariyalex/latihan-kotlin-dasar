package belajar.oop.data

open class Employee(val name: String) {
    open val age: Int = 20;
    open fun sayHello(name: String) {
        println("Hello $name, My Name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    override val age: Int = 23
    val parentAge = super.age; //super hanya bisa mengakses 1 tingkat parent class

    override fun sayHello(name: String) { //tambahkan final pada ujung kiri untuk menghentikan overriding function say hello yang diopen di parent.
        println("Hello $name, My Name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
    override val age: Int = 29

    override fun sayHello(name: String) {
        println("Hello $name, My Name is SuperManager ${this.name}")
    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello $name, My Name is ViceManager ${this.name}")
    }
}