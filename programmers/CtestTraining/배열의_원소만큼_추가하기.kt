fun main(args: Array<String>) {
    println(solution(intArrayOf(5, 1, 4)))
}

fun solution(arr: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    for (i in arr.indices) {
        for (j in 0 until arr[i]) {
            answer += arr[i]
        }
    }

    return answer
}