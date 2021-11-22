package dev.mirowsky.sectionTwo.testing
import dev.mirowsky.sectionTwo.atomicTest.*


fun main() {
    trace("line 1")
    trace(47)
    trace("line 2")
    trace eq """
        line 1
        47
        line 2
            """"
}

