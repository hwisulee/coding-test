fun main(args: Array<String>) {
    println(solution("582", "734"))
}

fun solution(a: String, b: String): String = (a.toBigDecimal() + b.toBigDecimal()).toString()