class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = n
        val lostSet = lost.sorted().toSet() - reserve.toSet()
        val reserveSet = (reserve.toSet() - lost.toSet()) as MutableSet
        
        for (i in lostSet) {
            when {
                i - 1 in reserveSet -> reserveSet.remove(i - 1)
                i + 1 in reserveSet -> reserveSet.remove(i + 1)
                else -> answer--
            }
        }
        
        return answer
    }
}