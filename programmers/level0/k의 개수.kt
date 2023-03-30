fun main(args: Array<String>) {
    println(solution(1, 13, 1))
}

fun solution(i: Int, j: Int, k: Int): Int = IntRange(i, j).joinToString("").toList().count { it == k.digitToChar() }