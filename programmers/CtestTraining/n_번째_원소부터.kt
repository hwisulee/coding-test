fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 1, 6), 3))
}

fun solution(num_list: IntArray, n: Int): IntArray = num_list.slice(n - 1 .. num_list.lastIndex).toIntArray()