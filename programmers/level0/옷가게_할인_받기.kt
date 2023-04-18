import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println(solution(580000))
}

fun solution(price: Int): Int {
    return if (price >= 500000) (price - (price * 0.2).roundToInt()) else if (price in 300000 .. 499999) (price - (price * 0.1).roundToInt()) else if (price >= 100000) (price - (price * 0.05).roundToInt()) else price
}