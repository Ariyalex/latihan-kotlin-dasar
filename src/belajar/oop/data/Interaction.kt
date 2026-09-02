package belajar.oop.data

interface Interaction {
    var name: String
    fun sayHello() //perbedaan function interface dgn abstract adalah bisa menambahkan bracket di fungsinya, jadi tidak hanya deklarasi saja
}

interface Go {
    fun go() {
        println("contoh penggunaan function di interface")
    }
}

//interface bisa mewarisi interface lain, tapi tidak bisa mewarisi class
interface ReadingA : Interaction {
    fun read() {
        println("read A")
    }
}

interface ReadingB {
    fun read() {
        println("read B")
    }
}

open class AbstractClassExample

class Human(override var name: String) : AbstractClassExample(), Interaction,
    Go, ReadingA, ReadingB { //class bisa mewarisi lebih dari 1 interface, tapi hanya bisa mewarisi 1 class saja
    override fun sayHello() {
        println("hello $name")
    }

    //    jika mewarisi 2 interface dengan 2 function dengan nama yang sama
//    maka harus override function tersebut
    override fun read() {
//        kalau ingin spesifik mengakses fungsi dari salah satu interface
//        harus menspesifikasikan interface yang mana, contohnya di bawah:
        super<ReadingA>.read()
        super<ReadingA>.read()
    }
}