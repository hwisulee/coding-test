fun main(args: Array<String>) {
    println(solution(intArrayOf(149, 180, 192, 170), 167))
}

fun solution(array: IntArray, height: Int): Int = array.count { it > height }