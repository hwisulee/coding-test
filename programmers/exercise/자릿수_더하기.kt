class Solution {
    fun solution(n: Int): Int {
        return n.toString().map { it.digitToInt() }.sum()
    }
}