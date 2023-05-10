fun main(args: Array<String>) {
    println(solution(3, 10))
}

fun solution(start: Int, end: Int): IntArray = (start .. end).map { it }.toIntArray()