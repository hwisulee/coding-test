fun main(args: Array<String>) {
    println(solution("programmers", "p"))
}

fun solution(my_string: String, alp: String): String = my_string.replace(alp, alp.uppercase())