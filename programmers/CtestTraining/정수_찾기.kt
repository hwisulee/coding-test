fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5), 3))
}

fun solution(num_list: IntArray, n: Int): Int = if (num_list.count { it == n } > 0) 1 else 0