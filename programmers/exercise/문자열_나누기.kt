class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var str = s

        while (str.isNotEmpty()) {
            val arr = intArrayOf(1, 0)
            
            for (i in 1 until str.length) {
                if (str[0] == str[i]) arr[0] += 1
                else arr[1] += 1
                
                if (arr[0] == arr[1]) break
            }
            
            str = str.substring(arr.sum())
            answer++
        }
        
        return answer
    }
}