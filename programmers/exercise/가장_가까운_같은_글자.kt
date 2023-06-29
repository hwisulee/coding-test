class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        val charset = mutableSetOf<Char>()
        
        for (i in s.indices) {
            if (charset.contains(s[i])) {
                val indexArr = s.slice(s.indexOf(s[i]) .. i).mapIndexed { index, it -> if (it == s[i]) index else -1 }.filter { it != -1 }
                
                answer += indexArr[indexArr.lastIndex] - indexArr[indexArr.lastIndex - 1]
            } else {
                charset.add(s[i])
                answer += -1
            }
        }
        return answer
    }
}