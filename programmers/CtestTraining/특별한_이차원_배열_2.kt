fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(5, 192, 33), intArrayOf(192, 72, 95), intArrayOf(33, 95, 999))))
}

fun solution(arr: Array<IntArray>): Int = if (arr.indices.map { i -> arr[i].indices.count { j -> arr[i][j] == arr[j][i] }}.filterNot { it == arr[0].size }.isEmpty()) 1 else 0