import kotlin.math.abs

fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(3, 5), intArrayOf(4, 1), intArrayOf(2, 4), intArrayOf(5, 10))))
}

fun solution(dots: Array<IntArray>): Int {
    //a,b,c,d
    //1. ab, cd -- 01, 23
    //2. ac, bd -- 02, 13
    //3. ad, bc -- 03, 12

    if (abs((dots[0][0] - dots[1][0]).toDouble() / (dots[0][1] - dots[1][1]).toDouble()) == abs((dots[2][0] - dots[3][0]).toDouble() / (dots[2][1] - dots[3][1]).toDouble())) return 1
    if (abs((dots[0][0] - dots[2][0]).toDouble() / (dots[0][1] - dots[2][1]).toDouble()) == abs((dots[1][0] - dots[3][0]).toDouble() / (dots[1][1] - dots[3][1]).toDouble())) return 1
    if (abs((dots[0][0] - dots[3][0]).toDouble() / (dots[0][1] - dots[3][1]).toDouble()) == abs((dots[1][0] - dots[3][0]).toDouble() / (dots[1][1] - dots[3][1]).toDouble())) return 1

    return 0
}