package dev.mirowsky.sectionOne


data class Person(val firstName: String, val lastName: String, val age: Int)

fun johnDoeFactory(): Person {

    return Person("John", "Doe", 21)
}




