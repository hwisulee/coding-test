fun main(args: Array<String>) {
    println(solution("AbCdEFG", "dE"))
}

fun solution(myString: String, pat: String): String = myString.substringBeforeLast(pat) + pat