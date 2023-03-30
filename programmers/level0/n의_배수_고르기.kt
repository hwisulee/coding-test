fun main(args: Array<String>) {
    println(solution(3, intArrayOf(4, 5, 6, 7, 8, 9 , 10, 11 ,12)))
}

fun solution(n: Int, numlist: IntArray): IntArray {
    var answer: IntArray = intArrayOf()

    for (i in numlist.indices) {
        if (numlist[i] % n == 0) {
            answer += numlist[i]
        }
    }
    return answer
}