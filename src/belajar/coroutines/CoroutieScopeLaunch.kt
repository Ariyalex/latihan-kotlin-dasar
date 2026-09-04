package belajar.coroutines

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

//    use coroutineScope.launch to run a task alongside other work when the result isn't needed or you don't want to wait for it

suspend fun performBackgroundWork() = coroutineScope {

//    starts a coroutine that runs without blocking the scope
    this.launch {
        delay(100.milliseconds)
        println("Sending notification in background")
    }

//    main coroutine continues while a previous one suspends
    println("Scope continues")
}

fun main() {
    runBlocking {
        async { performBackgroundWork() }.await()
    }
}