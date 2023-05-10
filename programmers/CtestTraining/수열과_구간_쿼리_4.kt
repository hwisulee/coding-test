fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 2, 4, 3), arrayOf(intArrayOf(0, 4, 1), intArrayOf(0, 3, 2), intArrayOf(0, 3, 3))))
}

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer: IntArray = arr.clone()

    for (i in queries.indices) {
        for (j in arr.indices) {
            if (j >= queries[i][0] && j <= queries[i][1]) {
                if (j % queries[i][2] == 0) {
                    answer[j] += 1
                }
            }
        }
    }

    return answer
}