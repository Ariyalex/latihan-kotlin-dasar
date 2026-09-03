package belajar.generic.data

class MyData<T, U>(val firstData: T, val secondData: U) {
    fun getFirst(): T = firstData
    fun getSecond(): U = secondData

    fun printMyData() {
        println("Data is $firstData and $secondData")
    }

    fun <X> sayHello(name: X) = println("Hello $name")
}