fun main(args: Array<String>) {
    println(solution("He11oWor1d", "lloWorl", 2))
}

fun solution(my_string: String, overwrite_string: String, s: Int): String  = my_string.substring(0 until s) + overwrite_string + my_string.substring(s + overwrite_string.length until  my_string.length)