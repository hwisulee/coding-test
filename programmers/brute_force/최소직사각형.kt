class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer = intArrayOf(0, 0)
        for ((x, y) in sizes) {
            if (x >= y) {
                if (x >= answer[0]) answer[0] = x
            } else {
                if (y >= answer[0]) answer[0] = y
            }
            
            if (y <= x) {
                if (y >= answer[1]) answer[1] = y
            } else {
                if (x >= answer[1]) answer[1] = x
            }
        }
        
        return answer.reduce { x, y -> x * y }
    }
}