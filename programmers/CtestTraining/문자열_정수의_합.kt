fun main(args: Array<String>) {
    println(solution("123456789"))
}

fun solution(num_str: String): Int = num_str.sumOf { it.digitToInt() }