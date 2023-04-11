fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8), 2))
}

fun solution(num_list: IntArray, n: Int) = num_list.toList().chunked(n)