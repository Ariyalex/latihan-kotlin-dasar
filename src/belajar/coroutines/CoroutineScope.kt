package belajar.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

suspend fun main() {
//    coroutine tanpa dispatcher akan menjalankan kode di context.
//    kalau context ini dispesifikasikan CoroutineScope.launch() akan menggunakan Despatcher.Default, yang berjalan pada shared pool of threads
    coroutineScope {
        launchAll()
        this.launch {
            this.launch {
                delay(2.seconds)
                println("Child of the enclosing coroutine completed")
            }
            println("Child coroutine 1 completed")
        }
        this.launch {
            delay(1.seconds)
            println("child coroutine 2 completed")
        }
    }
    println("Coroutine scope completed")
}

fun CoroutineScope.launchAll() {
    this.launch { println("1") }
    this.launch { println("2") }
}