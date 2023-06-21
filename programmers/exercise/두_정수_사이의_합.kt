class Solution {
    fun solution(a: Int, b: Int): Long {
        val aL = a.toLong()
        val bL = b.toLong()
        return if (aL < bL) (aL .. bL).sumOf { it }.toLong() else (bL .. aL).sumOf { it }.toLong()
    }
}