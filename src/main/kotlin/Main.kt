import dev.mirowsky.sectionOne.johnDoeFactory
import java.util.concurrent.CompletableFuture
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

fun main(args: Array<String>)   {


    val (first, lastName, age) = johnDoeFactory()



    fun foo(): CompletableFuture<String> = CompletableFuture.supplyAsync {"foo"}



    println(first)
    println(lastName)
    println(age)

}