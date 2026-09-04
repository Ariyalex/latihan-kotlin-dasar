package belajar.coroutines

import kotlinx.coroutines.*


fun main() {
    runBlocking {
        withContext(Dispatchers.Default) {
            val childStarted = CompletableDeferred<Unit>()

            val childJob: Job = this.launch {
                println("The coroutine has started.")

//                completes the completableDeffered
//                signaling that the coroutine has started running
                childStarted.complete(Unit)
                try {
//                    suspend indefinitely
//                    this call will never return unless the coroutine is canceled
                    awaitCancellation()
                } catch (e: CancellationException) {
                    println("The Coroutine is cancelled: $e.")
                    throw e
                }
                println("This line will never be executed.")
            }

            childStarted.await()
            childJob.cancel()
        }
        println("All coroutines have completed.")
    }
}