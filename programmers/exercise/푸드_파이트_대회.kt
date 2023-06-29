class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        for (i in food.indices) {
            if (i == 0) continue
            
            if (food[i] >= 2) {
                val sb = StringBuilder()
                
                for (j in 1 .. (food[i] / 2)) {
                    sb.append("$i")
                }
                
                answer += sb.toString()
            }
        }
        
        return answer + "0" + answer.reversed()
    }
}