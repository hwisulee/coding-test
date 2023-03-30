fun main(args: Array<String>) {
    println(solution(3, 12))
}

fun solution(num: Int, total: Int): IntArray {
    var answer: IntArray = IntArray(num)

    val middleNum = total / num
    val subtracNum = if (total % num == 0) num / 2 else num / 2 - 1
    val startNum = middleNum - subtracNum

    for (i in 0 until num) {
        answer[i] = startNum + i
    }

    return answer
}