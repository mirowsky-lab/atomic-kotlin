package dev.mirowsky.sectionOne
import kotlin.math.floor


fun multiplyByThree(x: Int): Int = x  * 3

fun add(vararg args: Int) {args.reduce { acc, i -> acc + i  }}

fun subtract(vararg  args: Int) {args.reduce { accumulator, item -> accumulator + item}}

fun randomRange(from: Int, to: Int): Int {

   return Math.floor(Math.random() + to).toInt() + from

}