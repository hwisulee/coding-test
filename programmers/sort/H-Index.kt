class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        
        citations.sortedDescending().let { for (i in it.indices) { if (it[i] < i + 1) return i }; answer = it.size }
        return answer
    }
}