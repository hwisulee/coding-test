fun main(args: Array<String>) {
    println(solution("1 - 1 + 0"))
}

fun solution(polynomial: String): String {
    var answer: String = ""

    var x = 0
    var num = 0

    for (i in polynomial.split(" ".toRegex())) {
        if (i.contains("x")) {
            x += if (i == "x") 1 else i.replace("x".toRegex(), "").toInt()
        } else if (i != "+") {
            num += i.toInt()
        }
    }

    answer = if (x != 0) {
        if (x > 1) {
            "${x}x"
        } else {
            "x"
        }
    } else {
        ""
    }

    answer += if (num != 0) {
        if (x != 0) {
            " + $num"
        } else {
            "$num"
        }
    } else if (x == 0) {
        "0"
    } else {
        ""
    }

    return answer
}