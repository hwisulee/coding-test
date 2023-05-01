fun main(args: Array<String>) {
    println(solution("i  love you"))
}

fun solution(my_string: String): Array<String> = my_string.split(" ").filter { it.isNotEmpty() }.toTypedArray()