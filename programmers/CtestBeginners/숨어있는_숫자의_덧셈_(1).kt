fun main(args: Array<String>) {
    println(solution("aAb1B2cC34oOp"))
}

fun solution(my_string: String): Int = my_string.split("[A-z]+".toRegex()).joinToString("").toList().sumOf { it.digitToInt() }