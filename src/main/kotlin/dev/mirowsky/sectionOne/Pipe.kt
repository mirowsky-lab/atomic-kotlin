package dev.mirowsky.sectionOne


infix fun <T, R> T.pipe(map : (T) -> R) : R = map(this)