fun main(args: Array<String>) {
    println(solution(10, 3))
}

fun solution(start: Int, end: Int): IntArray = (start downTo end).map { it }.toIntArray()