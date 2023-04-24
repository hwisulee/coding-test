fun main(args: Array<String>) {
    println(solution("hi12392"))
}

fun solution(my_string: String): IntArray = my_string.filter { it.isDigit() }.toList().map { it.digitToInt() }.sorted().toIntArray()