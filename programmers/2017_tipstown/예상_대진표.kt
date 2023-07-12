class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var newA = a
        var newB = b
        
        while (true) {
            if (newA == newB) break
            
            newA = (newA + 1) / 2
            newB = (newB + 1) / 2
            answer++
        }

        return answer
    }
}