class Solution {
    fun solution(s: String): IntArray {
        var answer = intArrayOf()
        s.removeSurrounding("{{", "}}").split("},{").sortedBy { it.length }.forEach {
            val arr = it.split(",")
            arr.forEach { i -> if (!answer.contains(i.toInt())) answer += i.toInt() }
        }

        return answer
    }
}