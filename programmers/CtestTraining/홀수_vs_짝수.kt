fun main(args: Array<String>) {
    println(solution(intArrayOf(4, 2, 6, 1, 7, 6)))
}

fun solution(num_list: IntArray): Int {
    var a = num_list.filterIndexed { index, i -> index % 2 == 0 }.sumOf { it }
    var b = num_list.filterIndexed { index, i -> index % 2 == 1 }.sumOf { it }

    return if (a > b) {
        a
    } else {
        b
    }
}