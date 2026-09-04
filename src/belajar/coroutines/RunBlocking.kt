package belajar.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

//    runBlocking adalah coroutineBuilder function yang membuat coroutine scope dan memblokir current thread sampai semua coroutines dalam scope itu dijalankan
//    gunakan ini jika tidak ada opsi lain untuk call suspending code dari non suspending code
//    contohnya kalau mau menjalankan kode suspending di main tanpa membuat suspend fun main

interface Repository {
    fun readItem(): Int
}

object MyRepository : Repository {
    override fun readItem(): Int {
//run blocking selalu di function yang tidak suspend
//        kekurangannya ini akan memblokir current thread sampai coroutine yang ada di dalam runBlocking selesai
        return runBlocking {
            myReadItem()
        }
    }

}

suspend fun myReadItem(): Int {
    delay(100.milliseconds)
    return 4
}

fun main() {


//    runBlocking { }

    println(MyRepository.readItem())
}

