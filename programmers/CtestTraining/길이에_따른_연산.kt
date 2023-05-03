fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 3, 4, 5)))
}

fun solution(num_list: IntArray): Int = if (num_list.size > 10) num_list.sumOf { it } else num_list.fold(1) { acc, i -> acc * i }