fun main(args: Array<String>) {
    println(solution("ab6CDE443fgh22iJKImn1o", "6CD"))
}

fun solution(str1: String, str2: String): Int {
    return if (str1.indexOf(str2) != -1) {
        1
    } else {
        2
    }
}