package belajar.coroutines

import kotlinx.coroutines.*

//default dispatcher adalah digunakan untuk memindahkan task ke thread lain dimana task ini merupakan task berat
suspend fun defaultDispatcher(): String {
    return withContext(Dispatchers.Default) {
        println("berjalan di thread ${Thread.currentThread().name}")
        delay(2000)
        "proses selesai"
    }
}

//io dispatcher digunakan untuk task ringan tapi perlu menunggu seperti API call, download file, write/read local database
suspend fun ioDispatcher(): String {
    return withContext(Dispatchers.IO) {
        println("berjalan di thread ${Thread.currentThread().name}")
        delay(2000)
        "proses selesai"
    }
}

//main dispatcher digunakan untuk task utama, seperti UI itu task utama, kalau kita melakukan await disini, aplikasi akan macet dan akan mengalami Application Not Responding
suspend fun mainDispatcher(): String {
    return withContext(Dispatchers.Main) {
        println("berjalan di thread ${Thread.currentThread().name}")
        delay(2000)
        "proses selesai"
    }
}

suspend fun launchIoDispatcher() = coroutineScope {
    this.launch(Dispatchers.IO) {
        println("fungsi ini berjalan di thread ${Thread.currentThread().name}")
    }
}

fun main() {
    runBlocking {
        println("Berjalan di thread ${Thread.currentThread().name}")
        val hasil = async { defaultDispatcher() }
        val hasil2 = async { ioDispatcher() }
//        val hasil3 = async { mainDispatcher() }

        launchIoDispatcher()
        println(hasil.await())
        println(hasil2.await())
//        println(hasil3.await())
    }
}