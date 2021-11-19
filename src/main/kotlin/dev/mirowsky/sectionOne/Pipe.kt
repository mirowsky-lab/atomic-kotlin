package dev.mirowsky.sectionOne


infix fun <T, R> T.then(map : (T) -> R) : R = map(this)





