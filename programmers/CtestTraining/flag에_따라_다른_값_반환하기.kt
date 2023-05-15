fun main(args: Array<String>) {
    println(solution(-4, 7, true))
}

fun solution(a: Int, b: Int, flag: Boolean): Int = if (flag) a + b else a - b