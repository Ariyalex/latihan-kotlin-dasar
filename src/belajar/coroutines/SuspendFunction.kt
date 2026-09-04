package belajar.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun ambilData(): String {
    delay(2000)
    return "Data dari server"
}

fun main() {
    println("test 1")
    runBlocking {
        suspend {
            val deferred1 = async { ambilData() };
            val deferred2 = async { ambilData() };


            val hasil1 = deferred1.await()
            val hasil2 = deferred2.await()

            println(hasil1)
            println(hasil2)
        }

    }
}