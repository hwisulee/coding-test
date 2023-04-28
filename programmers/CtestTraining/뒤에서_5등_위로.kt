fun main(args: Array<String>) {
    println(solution(intArrayOf(12, 4, 15, 46, 38, 1, 14, 56, 32, 10)))
}

fun solution(num_list: IntArray): IntArray = num_list.sorted().slice(5 until num_list.size).toIntArray()