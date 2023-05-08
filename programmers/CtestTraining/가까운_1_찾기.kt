fun main(args: Array<String>) {
    println(solution(intArrayOf(1, 1, 1, 1, 0), 3))
}

fun solution(arr: IntArray, idx: Int): Int {
    for ((acc, i) in arr.withIndex()) {
        if (acc >= idx && i == 1) {
            return acc
        }
    }
    
    return -1
}