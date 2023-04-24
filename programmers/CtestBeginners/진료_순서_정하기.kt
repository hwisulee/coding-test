fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 76, 24)))
}

fun solution(emergency: IntArray): IntArray = emergency.map { emergency.map { it }.sortedDescending().indexOf(it) + 1 }.toIntArray()