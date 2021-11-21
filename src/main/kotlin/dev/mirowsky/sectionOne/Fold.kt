
fun <TType, TReturn> Collection<TType>.fold(initial: TReturn, combine: (acc: TReturn, next: TType) -> TReturn): TReturn {
    var accumulator: TReturn = initial

    for (element: TType in this) {
        accumulator = combine(accumulator, element)
    }

    return accumulator
}
