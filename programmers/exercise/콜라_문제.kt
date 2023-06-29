class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var empty = n
        
        while (true) {
            answer += empty / a * b
            empty = (empty % a) + ((empty / a) * b)
            println(empty)
            
            if (empty < a) break
        }
        
        return answer
    }
}