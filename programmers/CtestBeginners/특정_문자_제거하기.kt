fun main(args: Array<String>) {
    println(solution("abcdef", "f"))
}

fun solution(my_string: String, letter: String): String = my_string.filterNot { it == letter.toCharArray()[0] }