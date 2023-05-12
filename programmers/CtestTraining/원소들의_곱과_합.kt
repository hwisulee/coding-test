import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 4, 5, 2, 1)))
}

fun solution(num_list: IntArray): Int = if (num_list.fold(1) { acc, i -> acc * i } < num_list.sum().toDouble().pow(2).toInt()) 1 else 0