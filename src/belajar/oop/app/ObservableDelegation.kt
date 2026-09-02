package belajar.oop.app

import belajar.oop.data.Account

fun main() {
    val observable = Account("ini deskripsi pertama");

    observable.description = "Hello world"
    observable.description = "Hello Eko"
    observable.description = "halo dunia baru"
}