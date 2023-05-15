fun main(args: Array<String>) {
    println(solution(60, 2, 3))
}

fun solution(number: Int, n: Int, m: Int): Int = if (number % n == 0 && number % m == 0) 1 else 0