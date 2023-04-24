fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3)))
}

fun solution(sides: IntArray): Int {
    return if (sides.sumOf { it } - sides.maxOf { it } > sides.maxOf { it }) {
        1
    } else {
        2
    }
}