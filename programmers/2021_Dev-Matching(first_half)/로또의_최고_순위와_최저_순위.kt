class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val correct = lottos.intersect(win_nums.toMutableList()).count()
        val zeroCnt = lottos.count { it == 0 }
        
        return intArrayOf(returnScore(correct + zeroCnt), returnScore(correct))
    }
    
    fun returnScore(num: Int): Int {
        return when (num) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}