class Solution {
    fun solution(n: Long): Long = n.toString().chunked(1).sortedDescending().joinToString("").toLong()
}