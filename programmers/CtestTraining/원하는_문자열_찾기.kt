fun main(args: Array<String>) {
    println(solution("AbCdEfG", "aBc"))
}

fun solution(myString: String, pat: String): Int = if (myString.lowercase().contains(pat.lowercase())) 1 else 0