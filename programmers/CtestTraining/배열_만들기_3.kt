fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5), arrayOf(intArrayOf(1, 3), intArrayOf(0, 4))))
}

fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray = arr.sliceArray(intervals[0][0] .. intervals[0][1]) + arr.sliceArray(intervals[1][0] .. intervals[1][1])