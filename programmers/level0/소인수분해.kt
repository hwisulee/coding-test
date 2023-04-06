fun main(args: Array<String>) {
    println(solution(12))
}

fun solution(n: Int): IntArray {
    var answer: IntArray = intArrayOf()
    var temp = n
    var i = 2

    while (temp >= 2) {
        if (temp % i == 0) {
            answer += i
            temp /= i
        } else {
            i++
        }
    }

    return answer.distinct().sorted().toIntArray()
}