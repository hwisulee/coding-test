fun main(args: Array<String>) {
    println(solution("rermgorpsam", arrayOf(intArrayOf(2, 3), intArrayOf(0, 7), intArrayOf(5, 9), intArrayOf(6, 10))))
}

fun solution(my_string: String, queries: Array<IntArray>): String {
    var answer: String = my_string

    for (i in queries.indices) {
        answer = answer.slice(0 until queries[i][0]) + answer.slice(queries[i][0] .. queries[i][1]).reversed() + answer.slice(queries[i][1] + 1 until answer.length)
    }

    return answer
}