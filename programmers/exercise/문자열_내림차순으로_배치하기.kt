class Solution {
    fun solution(s: String): String = s.chunked(1).sortedByDescending { it }.joinToString("")
}