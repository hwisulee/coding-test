fun main(args: Array<String>) {
    println(solution(arrayOf("progressive", "hamburger", "hammer", "ahocorasick"), arrayOf(intArrayOf(0, 4), intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(7, 7))))
}

fun solution(my_strings: Array<String>, parts: Array<IntArray>): String = my_strings.indices.joinToString("") { i -> my_strings[i].slice(parts[i][0]..parts[i][1]) }