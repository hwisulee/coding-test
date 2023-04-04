fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5)))
}

fun solution(numbers: IntArray): Int {
    val num1 = numbers.sorted()[numbers.lastIndex - 1] * numbers.maxOf { it }
    val num2 = numbers.sorted()[1] * numbers.minOf { it }

    return if (num1 > num2) {
        num1
    } else {
        num2
    }
}