import dev.mirowsky.sectionOne.johnDoeFactory
import java.util.concurrent.CompletableFuture

fun main(args: Array<String>)   {


    val (first, lastName, age) = johnDoeFactory()



    fun foo(): CompletableFuture<String> = CompletableFuture.supplyAsync {"foo"}



    println(first)
    println(lastName)
    println(age)

}