import kotlin.math.abs

fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5, 6), 4))
}

fun solution(numlist: IntArray, n: Int): IntArray = numlist.sortedWith(compareBy<Int> { abs(it - n) }.thenByDescending { it }).toIntArray()