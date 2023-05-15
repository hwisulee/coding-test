import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(7))
}

fun solution(n: Int): Int {
    return if (n % 2 == 0) {
        (1 .. n).filter { it % 2 == 0 }.sumOf { it.toDouble().pow(2) }.toInt()
    } else {
        (1 .. n).filter { it % 2 == 1 }.sum()
    }
}