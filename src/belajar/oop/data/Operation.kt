package belajar.oop.data

sealed class Operation(var name: String) {
}

class Plus : Operation("Penjumlahan");
class Minus : Operation("Pengurangan");
class Modulo : Operation("Sisa bagi");
