import dev.mirowsky.sectionOne.controlFlowDeclaration
import dev.mirowsky.sectionOne.isEven
import dev.mirowsky.sectionOne.randomRange
import kotlin.math.floor

fun main(args: Array<String>)   {


    val myList = listOf(1, 2, 3).fold(0) { acc, next -> acc + next }

    println(myList)

}