fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 1), intArrayOf(2, 2), intArrayOf(1, 2))))
}

fun solution(dots: Array<IntArray>): Int {
    var width = dots.toList().map { it[0] }.maxOf { it } - dots.toList().map { it[0] }.minOf { it }
    var height = dots.toList().map { it[1] }.maxOf { it } - dots.toList().map { it[1] }.minOf { it }
    return width * height
}