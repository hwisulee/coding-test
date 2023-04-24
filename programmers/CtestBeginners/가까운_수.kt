import kotlin.math.abs

fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 10, 28), 20))
}

fun solution(array: IntArray, n: Int): Int = array.minWithOrNull(compareBy { abs(it - n) })!!