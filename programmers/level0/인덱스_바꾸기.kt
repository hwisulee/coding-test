fun main(args: Array<String>) {
    println(solution("hello", 1, 2))
}

fun solution(my_string: String, num1: Int, num2: Int): String {
    val a = my_string.toList()[num1]
    val b = my_string.toList()[num2]

    return StringBuilder(my_string).also {
        it.setCharAt(num1, b)
        it.setCharAt(num2, a)
    }.toString()
}