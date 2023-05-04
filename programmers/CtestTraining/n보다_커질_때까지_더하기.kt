fun main(args: Array<String>) {
    println(solution(intArrayOf(34, 5, 71, 29, 100, 34), 123))
}

fun solution(numbers: IntArray, n: Int): Int {
    var answer: Int = 0

    for (i in numbers.indices) {
        if (answer > n) break

        answer += numbers[i]
    }

    return answer
}