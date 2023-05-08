fun main(args: Array<String>) {
    println(solution(intArrayOf(12, 4, 15, 46, 38, -2, 15)))
}

fun solution(num_list: IntArray): Int = if (num_list.minOf { it } < 0) num_list.indexOfFirst { it < 0 } else -1