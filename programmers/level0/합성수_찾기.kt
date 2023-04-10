fun main(args: Array<String>) {
    println(solution(10))
}

fun solution(n: Int): Int = (1..n).filter { i -> (1..i).filter { i % it == 0 }.size > 2 }.size