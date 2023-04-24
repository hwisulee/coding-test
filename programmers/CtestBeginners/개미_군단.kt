fun main(args: Array<String>) {
    println(solution(23))
}

fun solution(hp: Int): Int {
    var answer: Int = 0

    if (hp % 5 == 0) {
        answer =hp / 5
    }
    else {
        answer += hp / 5

        if ((hp % 5) == 4) answer += 2
        if ((hp % 5) == 3) answer += 1
        if ((hp % 5) <= 2) answer += (hp % 5) / 1
    }

    return answer
}