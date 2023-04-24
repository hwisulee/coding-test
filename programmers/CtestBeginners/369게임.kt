fun main(args: Array<String>) {
    println(solution(3))
}

fun solution(order: Int): Int = order.toString().toList().count { it.digitToInt() == 3 || it.digitToInt() == 6 || it.digitToInt() == 9 }