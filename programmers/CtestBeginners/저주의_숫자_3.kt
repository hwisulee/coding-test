fun main(args: Array<String>) {
    println(solution(15))
}

fun solution(n: Int): Int {
    var answer: Int = 0

    for (i in 0 until n) {
        answer++

        while (answer % 3 == 0 || answer.toString().contains("3")) {
            answer++
        }
    }

    return answer
}