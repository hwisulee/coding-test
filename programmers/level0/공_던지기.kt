fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3), 5))
}

fun solution(numbers: IntArray, k: Int): Int {
    var answer: Int = 1
    var temp = 0

    while (true) {
        if (answer > numbers.size) {
            answer -= numbers.size
        }

        answer += 2
        temp++

        if (temp == k) {
            answer -= 2
            break
        }
    }
    return answer
}