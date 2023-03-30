fun main(args: Array<String>) {
    println(solution(1234))
}

fun solution(n: Int): Int {
    var answer: Int = 0

    val temp = n.toString().split("").filter { it.isNotEmpty() }
    for (i in temp.indices) {
        answer += temp[i].toInt()
    }

    return answer
}