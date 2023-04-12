fun main(args: Array<String>) {
    println(solution("052"))
}

fun solution(rsp: String): String {
    var answer: String = ""

    for (i in rsp.indices) {
        if (rsp.split("").filter { it.isNotEmpty() }[i] == "2") {
            answer += "0"
        }

        if (rsp.split("").filter { it.isNotEmpty() }[i] == "0") {
            answer += "5"
        }

        if (rsp.split("").filter { it.isNotEmpty() }[i] == "5") {
            answer += "2"
        }
    }

    return answer
}