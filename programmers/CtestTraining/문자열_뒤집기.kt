fun main(args: Array<String>) {
    println(solution("Progra21Sremm3", 6, 12))
}

fun solution(my_string: String, s: Int, e: Int): String = my_string.slice(0 until s) + my_string.slice(s .. e).reversed() + my_string.slice(e + 1 .. my_string.lastIndex)