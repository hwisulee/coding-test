import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(solution(144))
}

fun solution(n: Int): Int {
    var answer: Int = 0

    answer = sqrt(n.toDouble()).roundToInt()

    return if (answer * answer == n) {
        1
    } else {
        2
    }
}