package belajar.oop.data

abstract class Animal {
    abstract var name: String
    abstract fun eat()
    abstract fun walk()
}

class Dog() : Animal() {
    override var name: String = "Doggy"
        get() = field.uppercase();
        set(value) {
            field = "Anjing $value";
        }

    lateinit var variableTelat: String;

    override fun eat() {
        println("$name is eating")
    }

    override fun walk() {
        println("$name is walking")
    }
}

//extension function
fun Dog.bark() {
    println("${this.name} is barking")
}

val Dog.upper: String
    get() = this.name.uppercase()

class Cat() : Animal() {
    override var name: String = "Margaret"
        get() {
            return if (field.contains("Kucing")) {
                field
            } else {
                "Kucing $field"
            }
        }
        set(value) {
            field = if (value.contains("Kucing")) {
                value
            } else {
                "Kucing $value"
            }
        }

    override fun eat() {
        println("$name is eating")
    }

    override fun walk() {
        println("$name is walking")
    }
}

