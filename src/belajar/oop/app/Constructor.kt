package belajar.oop.app

import belajar.oop.data.Address
import belajar.oop.data.Car

fun main() {

    val avansa = Car(paramBrand = "Avanza", "avansa bagus") //menggunakan secondary constructor 1
    val wuling = Car("Wuling") // menggunakan secondary constructor 2
    val yamaha = Car("Yamaha", "Kijang", 1999) //menggunakan primary constructor

    val alamatJoko = Address("jalan solo", "solo");
    val alamatJokoAnwar = Address("jalan solo", "solo", "Indonesia");
}