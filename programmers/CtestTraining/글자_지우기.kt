fun main(args: Array<String>) {
    println(solution("apporoograpemmemprs", intArrayOf(1, 16, 6, 15, 0, 10, 11 ,3)))
}

fun solution(my_string: String, indices: IntArray): String = my_string.filterIndexed { index, c -> !indices.contains(index) }