fun main(args: Array<String>) {
    println(solution(23))
}

fun solution(age: Int): String {
    var answer: String = ""
    var list = age.toString().toList()

    for (i in list.indices) {
        for (j in 0 .. 9) {
            if (list[i].digitToInt() == j) {
                answer += ('a' + j)
            }
        }
    }

    return answer
}