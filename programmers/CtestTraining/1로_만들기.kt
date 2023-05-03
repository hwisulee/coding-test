fun main(args: Array<String>) {
    println(solution(intArrayOf(12, 4, 15, 1, 14)))
}

fun solution(num_list: IntArray): Int {
    var answer: Int = 0

    for (i in num_list.indices) {
        var n = num_list[i]

        while (n > 1) {
            n /= 2
            answer++
        }
    }

    return answer
}