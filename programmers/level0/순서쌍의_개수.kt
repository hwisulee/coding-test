fun main(args: Array<String>) {
    println(solution(20))
}

fun solution(n: Int): Int = (1..n).filter { n % it == 0 }.size