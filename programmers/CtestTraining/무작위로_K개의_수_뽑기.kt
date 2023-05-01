fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 1, 1, 1), 4))
}

fun solution(arr: IntArray, k: Int): IntArray = if (arr.distinct().size < k) arr.distinct().toIntArray() + IntArray(k - arr.distinct().size) { -1 } else arr.distinct().slice(0 until k).toIntArray()