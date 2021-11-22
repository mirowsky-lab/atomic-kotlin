package dev.mirowsky.sectionOne

import java.util.concurrent.CompletableFuture
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

suspend fun <TTYpe> CompletableFuture<TTYpe>.await(): TTYpe = suspendCoroutine<TTYpe> { cont: Continuation<TTYpe> ->
    whenComplete {result, exception ->
        if (exception === null) {
            cont.resume(result)
        } else {
            cont.resumeWithException(exception)
        }
    }
}
