fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 8, 3)))
}

fun solution(array: IntArray): IntArray = intArrayOf(array.maxOf { it }, array.indexOfFirst { it == array.maxOf { it } })