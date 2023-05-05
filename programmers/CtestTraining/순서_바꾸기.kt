fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 1, 6), 1))
}

fun solution(num_list: IntArray, n: Int): IntArray = (num_list.slice(n until num_list.size) + num_list.slice(0 until n)).toIntArray()