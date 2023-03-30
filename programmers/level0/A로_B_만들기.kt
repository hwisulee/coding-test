fun main(args: Array<String>) {
    println(solution("olleh", "hello"))
}

fun solution(before: String, after: String): Int = if (before.toList().sumOf { it.code } == after.toList().sumOf { it.code }) 1 else 0