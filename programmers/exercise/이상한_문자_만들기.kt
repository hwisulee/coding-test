class Solution {
    fun solution(s: String): String { 
        var answer = ""
        var newStr = s.split(" ")
        repeat(newStr.size) {
            val sb = StringBuilder()
            
            for (i in newStr[it].indices) {
                if (i % 2 == 0) sb.append(newStr[it][i].toUpperCase())
                else sb.append(newStr[it][i].toLowerCase())
            }
            
            if (it < newStr.size - 1) sb.append(" ")
            answer += sb.toString()
        }
        return answer
    }
}