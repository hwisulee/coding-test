fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 4, 5, 6)))
}

fun solution(arr: IntArray): IntArray {
    var answer: IntArray = arr.clone()
    var temp = 1

    while (true) {
        if (arr.size.compareTo(temp) == -1) {
            for (i in 0 until temp - arr.size) {
                answer += 0
            }
            break
        }

        if (arr.size.compareTo(temp) == 0) {
            break
        }

        temp *= 2
    }

    return answer
}