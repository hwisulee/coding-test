import java.util.*

fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 2, 3, 100, 99, 98)))
}

fun solution(arr: IntArray): Int {
    var answer: Int = 0
    var array = arr

    while (true) {
        val temp = array.map { if (it >= 50 && it % 2 == 0) it / 2 else if (it % 2 == 1) if (it * 2 + 1 >= 100) it else it * 2 + 1 else it }.toIntArray()

        if (array.contentEquals(temp)) break
        Arrays.setAll(array) { temp[it] }
        answer++
    }

    return answer
}