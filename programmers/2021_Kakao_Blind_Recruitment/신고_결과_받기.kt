class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val reported = report.map { it.split(" ") }.groupBy { it[1] }
        val banned = reported.map { it.value.distinct() }.filter{ it.size >= k }.flatten()
        val getMail = banned.map { it[0] }.groupingBy { it }.eachCount()

        return getMail.run { id_list.map { getOrDefault(it, 0) }.toIntArray() }
    }
}