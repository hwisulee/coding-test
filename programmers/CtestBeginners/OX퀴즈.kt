fun main(args: Array<String>) {
    println(solution(arrayOf("3 - 4 = -3", "5 + 6 = 11")))
}

fun solution(quiz: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    answer = quiz.clone()

    for (i in quiz.indices) {
        var quizSplit = quiz[i].split(" ")

        if (quizSplit[1] == "+") {
            answer[i] = if (quizSplit[4].toInt() == (quizSplit[0].toInt().plus(quizSplit[2].toInt()))) {
                "O"
            } else {
                "X"
            }
        } else if (quizSplit[1] == "-") {
            answer[i] = if (quizSplit[4].toInt() == (quizSplit[0].toInt().minus(quizSplit[2].toInt()))) {
                "O"
            } else {
                "X"
            }
        }
    }

    return answer
}