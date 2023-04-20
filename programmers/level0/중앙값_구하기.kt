import kotlin.math.ceil

fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 7, 10, 11)))
}

fun solution(array: IntArray): Int = array.sorted()[ceil((array.size / 2).toDouble()).toInt()]