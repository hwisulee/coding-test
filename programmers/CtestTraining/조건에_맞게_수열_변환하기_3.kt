fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 100, 99, 98), 3))
}

fun solution(arr: IntArray, k: Int): IntArray = if (k % 2 == 0) arr.map { it + k }.toIntArray() else arr.map { it * k }.toIntArray()