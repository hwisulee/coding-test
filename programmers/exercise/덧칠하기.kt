class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var maxPaint = 0

        for (i in section) {
            if (maxPaint <= i) {
                maxPaint = i + m
                answer++
            }
        }
        return answer
    }
}