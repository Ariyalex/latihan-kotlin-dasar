package belajar.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.time.Duration.Companion.seconds

suspend fun greet() {
    println("The greet() on the thread: ${Thread.currentThread().name}")
    delay(1000L)
}

suspend fun main() {
    withContext(Dispatchers.Default) { //this: CoroutineScope
        this.launch { greet() }
        this.launch {
            println("The CoroutineScope.launch() on the thread: ${Thread.currentThread().name}")
            delay(1.seconds)
        }

        println("the withContext() on the thread: ${Thread.currentThread().name}")
    }
}

// Try running the example multiple times. You may notice that the output order and thread names may change each time you run the program, because the OS decides when threads run.