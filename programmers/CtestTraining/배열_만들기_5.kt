fun main(args: Array<String>) {
    println(solution(arrayOf("0123456789", "9876543210", "9999999999999"), 50000, 5, 5))
}

fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray = intStrs.indices.map { i -> intStrs[i].substring(s, s + l).toInt() }.filter { it > k }.toIntArray()