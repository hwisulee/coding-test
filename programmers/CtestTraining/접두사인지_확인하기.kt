fun main(args: Array<String>) {
    println(solution("banana", "ban"))
}

fun solution(my_string: String, is_prefix: String): Int = if (my_string.regionMatches(0, is_prefix, 0, is_prefix.length)) 1 else 0