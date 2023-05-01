fun main(args: Array<String>) {
    println(solution(intArrayOf(3, 2, 4, 1, 3), booleanArrayOf(true, false, true, false, false)))
}

fun solution(arr: IntArray, flag: BooleanArray): IntArray {
    var answer: IntArray = intArrayOf()

    for (i in flag.indices) {
        if (flag[i]) {
            for (j in 0 until arr[i] * 2) {
                answer += arr[i]
            }
        } else {
            answer = answer.dropLast(arr[i]).toIntArray()
        }
    }

    return answer
}