fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 2, 3, 4), arrayOf(intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(1, 4))))
}

fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
    var answer = arr.clone().toMutableList()

    for (i in queries.indices) {
        var temp = answer[queries[i][0]]
        answer[queries[i][0]] = answer[queries[i][1]]
        answer[queries[i][1]] = temp
    }

    return answer.toIntArray()
}