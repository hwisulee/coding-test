fun main(args: Array<String>) {
    println(solution("people"))
}

fun solution(my_string: String): String = my_string.toList().distinct().joinToString("")