fun main(args: Array<String>) {
    println(solution("string", 3))
}

fun solution(my_string: String, k: Int): String = (0 until  k).joinToString("") { my_string }