fun main(args: Array<String>) {
    println(solution(intArrayOf(49, 1, 100, 276, 33), 27))
}

fun solution(arr: IntArray, n: Int): IntArray {
    return if (arr.size % 2 == 0) {
        arr.mapIndexed { index, i -> if (index % 2 != 0) i + n else i }.toIntArray()
    } else {
        arr.mapIndexed { index, i -> if (index % 2 == 0) i + n else i }.toIntArray()
    }
}