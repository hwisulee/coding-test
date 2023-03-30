import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(2, 10))
}

fun solution(n: Int, t: Int): Int {
    var answer: Int = 0

    for (i in 1 .. t) {
        answer = (n * 2.0.pow(t.toDouble())).toInt()
    }

    return answer
}