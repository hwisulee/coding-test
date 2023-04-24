fun main(args: Array<String>) {
    println(solution(intArrayOf(7, 77 ,17)))
}

fun solution(array: IntArray): Int {
    return array.contentToString().replace("[", "").replace("]", "").count {
        it == '7'
    }
}