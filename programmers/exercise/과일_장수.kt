class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var box = score.sortedDescending().chunked(m)
        return box.filter { it.size >= m }.map { it.minOf { it } * m }.sum()
    }
}