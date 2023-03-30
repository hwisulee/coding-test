fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(80, 70), intArrayOf(90, 50), intArrayOf(40, 70), intArrayOf(50, 80))))
}

fun solution(score: Array<IntArray>): IntArray = score.map{ it.average() }.map { score.map{ it -> it.average() }.sortedDescending().indexOf(it) + 1 }.toIntArray()