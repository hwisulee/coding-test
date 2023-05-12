import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(2, 2, 1))
}

fun solution(a: Int, b: Int, c: Int): Int {
    var answer = intArrayOf(a, b, c)
    val newGroup = answer.groupBy { it }

    return when (newGroup.size) {
        3 -> answer.sum()
        2 -> {
            (answer[0] + answer[1] + answer[2]) * (answer[0].toDouble().pow(2) + answer[1].toDouble().pow(2) + answer[2].toDouble().pow(2)).toInt()
        }
        1 -> {
            ((answer[0] * 3) * (answer[0].toDouble().pow(2) * 3) * (answer[0].toDouble().pow(3) * 3)).toInt()
        }
        else -> -1
    }
}