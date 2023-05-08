fun main(args: Array<String>) {
    println(solution(intArrayOf(0, 1, 2, 3, 4, 5), intArrayOf(4, 1, 2)))
}

fun solution(arr: IntArray, query: IntArray): IntArray {
    var answer: IntArray = arr.clone()

    for (i in query.indices) {
        answer = if (i % 2 == 0) {
            answer.sliceArray(0 .. query[i])
        } else {
            answer.sliceArray(query[i] until answer.size)
        }
    }

    return answer
}