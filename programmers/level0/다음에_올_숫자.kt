fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4)))
}

fun solution(common: IntArray): Int {
    var answer: Int = 0

    answer = if ((common[1] - common[0]) == (common[2] - common[1])) {
        common[common.size - 1] + (common[1] - common[0])
    } else {
        common[common.size - 1] * (common[1] / common[0])
    }

    return answer
}