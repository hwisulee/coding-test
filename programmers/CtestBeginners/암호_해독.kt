fun main(args: Array<String>) {
    println(solution("dfjardstddetckdaccccdegk", 4))
}

fun solution(cipher: String, code: Int): String {
    var answer: String = ""
    var index = code
    while (index <= cipher.length) {
        if (index > cipher.length) {
            return answer
        }

        answer += cipher[index - 1]
        index += code
    }

    return answer
}