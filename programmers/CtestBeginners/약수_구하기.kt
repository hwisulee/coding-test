fun main(args: Array<String>) {
    println(solution(24))
}

fun solution(n: Int): IntArray = (1..n).toList().filter { n % it == 0 }.toIntArray()