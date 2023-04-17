fun main(args: Array<String>) {
    println(solution(10, 3))
}

fun solution(n: Int, k: Int): Int = (n * 12000) + (k * 2000) - ((n / 10) * 2000)