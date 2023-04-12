fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 4)))
}

fun solution(dot: IntArray): Int {
    if (dot[0] > 0 && dot[1] > 0) return 1
    if (dot[0] < 0 && dot[1] > 0) return 2
    if (dot[0] < 0 && dot[1] < 0) return 3
    if (dot[0] > 0 && dot[1] < 0) return 4
    return 0
}