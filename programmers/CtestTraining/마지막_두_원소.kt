fun main(args: Array<String>) {
    println(solution(intArrayOf(2, 1, 6)))
}

fun solution(num_list: IntArray): IntArray = if (num_list[num_list.lastIndex] > num_list[num_list.lastIndex - 1]) num_list + (num_list[num_list.lastIndex] - num_list[num_list.lastIndex - 1]) else num_list + (num_list[num_list.lastIndex] * 2)