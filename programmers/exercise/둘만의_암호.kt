class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        val chars = ('a' .. 'z').map { it }.filter { it !in skip.map { it.toChar() } }
        s.forEach {
            val newIndex = (chars.indexOf(it) + index) % chars.size
            answer += chars.elementAt(newIndex)
        }
        return answer
    }
}