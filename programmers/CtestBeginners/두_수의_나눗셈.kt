import kotlin.math.floor

fun main(args: Array<String>) {
    println(solution(7, 3))
}

fun solution(num1: Int, num2: Int): Int = floor(num1.toDouble() / num2.toDouble() * 1000.0).toInt()