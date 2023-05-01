fun main(args: Array<String>) {
    println(solution("43 + 12"))
}

fun solution(binomial: String): Int {
    var answer = binomial.split(" ")

    return when {
        answer[1] == "+" -> answer[0].toInt() + answer[2].toInt()
        answer[1] == "-" -> answer[0].toInt() - answer[2].toInt()
        answer[1] == "*" -> answer[0].toInt() * answer[2].toInt()
        else -> -1
    }
}