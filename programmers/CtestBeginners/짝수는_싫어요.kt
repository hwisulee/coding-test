fun main(args: Array<String>) {
    println(solution(10))
}

fun solution(n: Int): IntArray = (1..n).filter { it % 2 != 0 }.toIntArray()