fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 2), intArrayOf(0, 3, 2), intArrayOf(0, 2, 2))))
}

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray = queries.indices.map { i -> arr.filterIndexed { index, item -> index >= queries[i][0] && index <= queries[i][1] && item > queries[i][2] }.ifEmpty { listOf(-1) }.minOf { it } }.toIntArray()