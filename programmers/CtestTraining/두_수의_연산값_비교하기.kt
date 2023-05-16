fun main(args: Array<String>) {
    println(solution(2, 91))
}

fun solution(a: Int, b: Int): Int {
    var answer = (a.toString() + b.toString()).toInt()

    return if (answer >= 2 * a * b) answer else 2 * a * b
}