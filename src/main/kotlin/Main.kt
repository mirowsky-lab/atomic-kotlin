import dev.mirowsky.sectionOne.JohnDoeFactory
import dev.mirowsky.sectionOne.fold

fun main(args: Array<String>)   {


    val (firstName, lastName, age) = JohnDoeFactory()


    println(firstName)
    println(lastName)
    println(age)

}