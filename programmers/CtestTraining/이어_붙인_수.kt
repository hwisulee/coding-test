fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 4, 5, 2, 1)))
}

fun solution(num_list: IntArray): Int = num_list.filter { it % 2 == 1 }.joinToString("").toInt() + num_list.filter { it % 2 == 0 }.joinToString("").toInt()