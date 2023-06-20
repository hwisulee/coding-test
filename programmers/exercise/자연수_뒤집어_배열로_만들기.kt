class Solution {
    fun solution(n: Long): IntArray = n.toString().reversed().chunked(1).map { it.toInt() }.toIntArray()
}