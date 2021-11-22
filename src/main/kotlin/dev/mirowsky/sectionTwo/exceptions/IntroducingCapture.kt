package dev.mirowsky.sectionTwo.exceptions

import dev.mirowsky.sectionTwo.atomicTest.capture


fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For input string: "1$""""
}

