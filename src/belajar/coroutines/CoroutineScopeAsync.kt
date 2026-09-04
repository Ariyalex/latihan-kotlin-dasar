package belajar.coroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import kotlin.time.Duration.Companion.milliseconds

//singkatnya kalau CoroutineScope.async concurrent computation dalam coroutine scope yang memberikan return Interface Deffered
//Interface Deferred itu seperti Future dalam dart
//gunakan .await() untuk suspend kode sampai hasilnya jadi
suspend fun main() = withContext(Dispatchers.Default) {
    val firstPage = this.async {
        delay(50.milliseconds)
        "First page"
    }

    val secondPage = this.async {
        delay(100.milliseconds)
        "Second page"
    }

    val pagesAreEqual = firstPage.await() == secondPage.await()
    println("Pages are equal: $pagesAreEqual")
}