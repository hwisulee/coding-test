fun main(args: Array<String>) {
    println(solution("ProgrammerS123", 11))
}

fun solution(my_string: String, n: Int): String = my_string.substring(my_string.length - n, my_string.length)