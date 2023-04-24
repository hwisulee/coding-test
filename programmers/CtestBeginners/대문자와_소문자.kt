fun main(args: Array<String>) {
    println(solution("cccCCC"))
}

fun solution(my_string: String): String {
    return my_string.map {
        if (it == it.uppercaseChar()) {
            it.lowercase()
        } else {
            it.uppercase()
        }
    }.joinToString("")
}