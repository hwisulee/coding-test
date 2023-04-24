fun main(args: Array<String>) {
    println(solution(7))
}

fun solution(n: Int): Int {
    var answer: Int = 0
    var acc = 1

    for (i in 1 .. 10) {
        acc *= i

        if (acc <= n) {
            answer = i
        }
    }

    return answer
}