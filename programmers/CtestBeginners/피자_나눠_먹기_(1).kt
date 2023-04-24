fun main(args: Array<String>) {
    println(solution(43))
}

fun solution(n: Int): Int {
    var answer: Int = 0

    answer += n / 7

    if ((n % 7) < 7 && n % 7 != 0) {
        answer += 1
    }

    return answer
}