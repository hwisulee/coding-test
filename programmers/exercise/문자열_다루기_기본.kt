class Solution {
    fun solution(s: String): Boolean {
        var answer = false
        try {
            if ((s.length == 4 || s.length == 6) && s.toLowerCase().replace("[a-z]".toRegex(), "").length == s.length) answer = true
        } catch (_: Exception) {
            answer = false
        }
        
        return answer
    }
}