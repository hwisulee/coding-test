fun main(args: Array<String>) {
    println(solution("1 2 Z 3"))
}

fun solution(s: String): Int {
    var answer: Int = 0

    var temp = s.split(" ")

    for (i in temp.indices) {
        answer += if (temp[i] == "Z") {
            -temp[i - 1].toInt()
        } else {
            temp[i].toInt()
        }
    }

    return answer
}