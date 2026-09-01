package belajar.oop.data

class User(var username: String, var password: String) {
    fun sayHello() {
        println("Hello $username");
    }
}