fun main(args: Array<String>) {
    println(solution(91))
}

fun solution(angle: Int): Int {
    return when (angle) {
        in 1..89 -> 1
        90 -> 2
        in 91 .. 179 -> 3
        180 -> 4
        else -> 0
    }
}