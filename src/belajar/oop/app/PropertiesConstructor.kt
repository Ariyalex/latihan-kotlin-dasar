package belajar.oop.app

import belajar.oop.data.User

fun main() {
    val user1 = User("admin", "admin123");

    println(user1.username)

    user1.sayHello();
}