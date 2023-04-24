import kotlin.math.max

fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(57, 192, 534, 2), intArrayOf(9, 345, 192, 999))))
}

fun solution(arr: Array<IntArray>): Array<IntArray> {
    val max = max(arr.size, arr[0].size)
    val array = Array(max) { IntArray(max) }

    for (i in arr.indices) {
        System.arraycopy(arr[i], 0, array[i], 0, arr[0].size)
    }

    return array
}