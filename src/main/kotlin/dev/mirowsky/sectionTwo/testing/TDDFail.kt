package dev.mirowsky.sectionTwo.testing

import dev.mirowsky.sectionTwo.atomicTest.eq

fun main() {

    calculateBMI(160, 68) eq "Normal weight"
    calculateBMI(100, 68) eq "Underweight"
    calculateBMI(200, 68) eq "Overweight"
}



fun calculateBMI(lbs: Number, height: Number): String {
    val bmi = lbs.toDouble() / (height.toDouble() * height.toDouble()) * 703.07

    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}