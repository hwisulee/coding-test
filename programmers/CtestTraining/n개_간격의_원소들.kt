fun main(args: Array<String>) {
    println(solution(intArrayOf(4, 2, 6, 1, 7, 6), 2))
}

fun solution(num_list: IntArray, n: Int): IntArray {
    var answer: IntArray = intArrayOf()

    for (i in num_list.indices step n) {
        answer += num_list[i]
    }

    return answer
}