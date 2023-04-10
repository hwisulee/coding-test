fun main(args: Array<String>) {
    println(solution(intArrayOf(10, 8, 6), 3))
}

fun solution(box: IntArray, n: Int): Int {
    var width = box[0]
    var length = box[1]
    var height = box[2]

    return (width / n) * (length / n) * (height / n)
}