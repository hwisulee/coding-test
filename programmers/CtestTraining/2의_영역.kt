fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 1, 4, 5, 2)))
}

fun solution(arr: IntArray): IntArray {
    return if (arr.find { it == 2 } == 2) {
        arr.sliceArray(arr.indexOfFirst { it == 2 } .. arr.indexOfLast { it == 2 })
    } else {
        intArrayOf(-1)
    }
}