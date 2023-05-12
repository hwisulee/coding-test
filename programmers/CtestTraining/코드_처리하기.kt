fun main(args: Array<String>) {
    println(solution("abc1abc1abc"))
}

fun solution(code: String): String {
    var answer: String = ""
    var mode = false

    for (i in code.indices) {
        if (!mode) {
            if (code[i] == '1') {
                mode = true
            } else {
                if (i % 2 == 0) {
                    answer += code[i]
                }
            }
        } else {
            if (code[i] == '1') {
                mode = false
            } else {
                if (i % 2 == 1) {
                    answer += code[i]
                }
            }
        }
    }

    return answer.ifEmpty { "EMPTY" }
}