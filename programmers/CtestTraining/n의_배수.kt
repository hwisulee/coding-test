fun main(args: Array<String>) {
    println(solution(98, 2))
}

fun solution(num: Int, n: Int): Int = if (num % n == 0) 1 else 0