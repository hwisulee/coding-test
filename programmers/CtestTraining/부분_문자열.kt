fun main(args: Array<String>) {
    println(solution("abc", "aabcc"))
}

fun solution(str1: String, str2: String): Int = if (str2.contains(str1)) 1 else 0