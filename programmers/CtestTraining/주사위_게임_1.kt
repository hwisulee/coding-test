import kotlin.math.abs
import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(3, 5))
}

fun solution(a: Int, b: Int): Int {
    return if (a % 2 == 1 && b % 2 == 1) {
        (a.toDouble().pow(2) + b.toDouble().pow(2)).toInt()
    } else if (a % 2 == 1 || b % 2 == 1) {
        2 * (a + b)
    } else {
        abs(a - b)
    }
}