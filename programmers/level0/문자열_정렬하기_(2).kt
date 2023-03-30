fun main(args: Array<String>) {
    println(solution("Bcad"))
}

fun solution(my_string: String): String = my_string.lowercase().toMutableList().sorted().joinToString("")