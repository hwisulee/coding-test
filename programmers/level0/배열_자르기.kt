fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5), 1, 3))
}

fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray = numbers.slice(num1..num2).toIntArray()