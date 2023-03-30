fun main(args: Array<String>) {
    println(solution("abcabcadc"))
}

fun solution(s: String): String {
    return s.toList().groupBy { it }.filter { it.value.size == 1 }.flatMap { it.value }.distinct().sortedWith { a, b ->
        when {
            a > b -> 1
            a < b -> -1
            else -> 0
        }
    }.joinToString("")
}