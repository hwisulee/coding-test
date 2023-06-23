class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        val arr = (left .. right).map { it }
        
        for (i in arr.indices) {
            val divisorArr = getDivisor(arr[i])
            
            if (divisorArr.size % 2 == 0) answer += arr[i]
            else answer -= arr[i]
        }
        return answer
    }
    
    fun getDivisor(num: Int): IntArray {
        var arr = intArrayOf()
        
        for (i in 1 .. num) {
            if (num % i == 0) arr += i
        }
        return arr
    }
}