package belajar.oop.data

class Boss(var name: String) {

    inner class Employee(var name: String) {
        fun hiBoss() {
            println("Hi, my name is $name, my boss name is ${this@Boss.name}") //ini contoh cara akses data parent inner class
        }
    }
}