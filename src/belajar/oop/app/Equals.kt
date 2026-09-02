package belajar.oop.app

import belajar.oop.data.Company

fun main() {
    val company1 = Company("Teknohole")
    val company2 = Company("Teknohole")
    println(company1 == company2)

    println(company1.hashCode() == company2.hashCode())
}