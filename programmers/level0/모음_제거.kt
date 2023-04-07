fun main(args: Array<String>) {
    println(solution("nice to meet you"))
}

fun solution(my_string: String): String {
    var answer: String = ""

    println(my_string.filterNot { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' })

    return answer
}