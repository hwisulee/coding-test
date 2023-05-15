fun main(args: Array<String>) {
    println(solution("<", "=", 20, 50))
}

fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
    return when(if (eq == "!") ineq else ineq + eq) {
        ">" -> if (n > m) 1 else 0
        "<" -> if (n < m) 1 else 0
        ">=" -> if (n >= m) 1 else 0
        "<=" -> if (n <= m) 1 else 0
        else -> { -1 }
    }
}