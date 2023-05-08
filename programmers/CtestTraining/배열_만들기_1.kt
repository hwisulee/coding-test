fun main(args: Array<String>) {
    println(solution(10, 3))
}

fun solution(n: Int, k: Int): IntArray = (1 .. n).map { if (it % k == 0) it else 0 }.filter { it != 0 }.toIntArray()