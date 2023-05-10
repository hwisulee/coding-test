fun main(args: Array<String>) {
    println(solution("cvsgiorszzzmrpaqpe", intArrayOf(16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7)))
}

fun solution(my_string: String, index_list: IntArray): String = index_list.indices.joinToString("") { my_string.slice(index_list[it] .. index_list[it]) }