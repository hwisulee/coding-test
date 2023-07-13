class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var temp = 0

        tangerine.toMutableList().groupingBy { it }.eachCount().entries.sortedWith(compareByDescending<Map.Entry<Int, Int>> { it.value }.thenBy { it.key }).forEach {
            temp += it.value
            answer++

            if (temp >= k) return answer
        }
        return answer
    }
}