package dev.mirowsky.sectionTwo.packages

import kotlin.math.sqrt

//package pythagorean

class RightTriangle(private val a: Double, private val b: Double) {

    fun hypothenuse() = sqrt(a * a + b * b)
    fun area() = (a * b) / 2
}