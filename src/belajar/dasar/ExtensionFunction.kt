package belajar.dasar//ini digunakan untuk menambahkan function ke dalam tipe data yang tidak bisa kita ubah, contoh dari library orang lain atau tipe data bawaan kotlin

fun String.hello(): String = "Hello $this";

fun main() {
    val nama: String = "Ariya";
    println(nama.hello());

    println("Eko".hello());
}