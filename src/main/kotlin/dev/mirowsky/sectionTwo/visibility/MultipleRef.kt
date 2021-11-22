package dev.mirowsky.sectionTwo.visibility



class Counter(private var start: Int) {
    fun increment() {
        start++
    }
    override fun toString() = start.toString()

}


class CounterHolder(counter: Counter) {

    private val ctr = counter
    override fun toString() = "CounterHolder: $ctr"

}


fun main() {

    val c = Counter(11)
    val ch = CounterHolder(c)

    println(ch)
    c.increment()
    println(ch)


    val ch2 = CounterHolder(Counter(9))

    println(ch2)
}