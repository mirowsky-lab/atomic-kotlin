

fun add(vararg args: Int): Int = args.reduce {acc, next -> acc + next }


fun main(args: Array<String>) {

    println("Hello world")


    val allTheNumbs = add(1, 2, 3)


    println(allTheNumbs)

}