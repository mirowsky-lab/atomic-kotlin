import javax.lang.model.element.Element

fun add(vararg args: Int): Int = args.reduce {acc, next -> acc + next }


fun main(args: Array<String>) {

    println("Hello world")


    val allTheNumbs = add(1, 2, 3)



    List<Int>(10, init = {index -> index })
    println(allTheNumbs)


    fun lambdaSumAnon(vararg args: Int): Int = args.reduce { acc, list -> acc + list }


    val lambdaSum = {ars: List<Int> -> ars.reduce {acc, next ->  acc + next} }

    val lambdaFoldSum = listOf(2, 3, 4).fold(0) { acc, i ->  acc + i }

    println(lambdaSum(listOf(1, 2, 3)))

    println(lambdaFoldSum)

    println(lambdaSumAnon(10, 20, 30))
}