fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3))))
}

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = arr

    for (i in arr.indices) {
        for (j in queries.indices) {
            if (i >= queries[j][0] && i <= queries[j][1]) {
                answer[i] += 1
            }
        }
    }

    return answer
}