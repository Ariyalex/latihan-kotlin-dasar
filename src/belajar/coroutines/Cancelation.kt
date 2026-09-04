package belajar.coroutines

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job = launch {
            try {
                println("memulai tugas")
                delay(2000)
                println("Tugas selesai (pesai ini tidak akan pernah tercetak")
            } catch (e: CancellationException) {
                println("coroutine was cancelled")
            }
        }

        delay(500)
        job.cancel()
    }
}