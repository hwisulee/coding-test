fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5)))
}

fun solution(numbers: IntArray): Int {
    var first = numbers.sorted()[numbers.lastIndex]
    var second = numbers.sorted()[numbers.lastIndex - 1]

    return first * second
}