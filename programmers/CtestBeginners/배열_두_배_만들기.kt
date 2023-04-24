fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5)))
}

fun solution(numbers: IntArray): IntArray = numbers.map { it * 2 }.toIntArray()