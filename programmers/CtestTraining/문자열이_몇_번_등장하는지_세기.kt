fun main(args: Array<String>) {
    println(solution("banana", "ana"))
}

fun solution(myString: String, pat: String): Int {
    var answer: Int = 0

    for (i in myString.indices) {
        answer += if (myString.regionMatches(i, pat, 0, pat.length)) {
            1
        } else {
            0
        }
    }

    return answer
}