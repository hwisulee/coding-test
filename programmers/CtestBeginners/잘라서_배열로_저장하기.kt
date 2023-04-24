fun main(args: Array<String>) {
    println(solution("abc1Addfggg4556b", 6))
}

fun solution(my_str: String, n: Int): Array<String> {
    var answer: Array<String> = my_str.chunked(n).toTypedArray()
    return answer
}