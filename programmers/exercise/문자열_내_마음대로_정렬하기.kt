data class sort (val str: String, val idx: Char)

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<sort>()
        repeat(strings.size) {
            answer += sort(strings[it], strings[it][n])
        }

        answer.sortWith(compareBy<sort> { it.idx }.thenBy { it.str })

        return answer.map { it.str }.toTypedArray()
    }
}