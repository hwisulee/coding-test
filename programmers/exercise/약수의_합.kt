class Solution {
    fun solution(n: Int): Int {
        return (1 .. n).map { it }.filter { n % it == 0 }.sum()
    }
}