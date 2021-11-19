package dev.mirowsky.sectionOne

import kotlin.math.floor


fun controlFlowDeclaration() = if (floor(Math.random() + 1 * 10) > 5) println("hello") else println("no")
