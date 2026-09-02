package belajar.oop.app

import belajar.oop.data.Boss


fun main() {
    val boss1 = Boss("Joko")
    val employee1 = boss1.Employee("John Doe")
    val employee2 = boss1.Employee("Budi Setiawan")

    val boss2 = Boss("Prabowo")
    val employee3 = boss2.Employee("Teddy")
    val employee4 = boss2.Employee("Raffi")

    employee1.hiBoss()
    employee2.hiBoss()
    employee3.hiBoss()
    employee4.hiBoss()
}