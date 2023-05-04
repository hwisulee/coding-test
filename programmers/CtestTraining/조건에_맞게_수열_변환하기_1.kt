fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 100, 99, 98)))
}

fun solution(arr: IntArray): IntArray = arr.map { if (it >= 50 && it % 2 == 0) it / 2 else if (it % 2 == 1) if (it * 2 >= 100) it else it * 2 else it }.toIntArray()