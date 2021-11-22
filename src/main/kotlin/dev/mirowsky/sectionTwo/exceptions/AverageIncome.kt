package dev.mirowsky.sectionTwo.exceptions

import dev.mirowsky.sectionTwo.atomicTest.capture
import dev.mirowsky.sectionTwo.atomicTest.eq
import java.lang.IllegalArgumentException

fun averageIncome(income: Int, months: Int) = if (months == 0) throw IllegalArgumentException("Months can't be zero") else income / months

fun main() {
    averageIncome(3300, 3) eq 1100


    capture {
        averageIncome(5000, 0)
    } eq "IllegalArgumentException: Months can't be zero"
}

