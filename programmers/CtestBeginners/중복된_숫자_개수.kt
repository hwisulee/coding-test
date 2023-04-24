fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 1, 2, 3, 4, 5), 1))
}

fun solution(array: IntArray, n: Int): Int = array.count{ it == n }