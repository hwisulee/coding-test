fun main(args: Array<String>) {
    println(solution(3, 1, "qjnwezgrpirldywt"))
}

fun solution(q: Int, r: Int, code: String): String = code.mapIndexed { index, c -> if (index % q == r) c else "" }.joinToString("")