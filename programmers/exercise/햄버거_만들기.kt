class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        var sb = StringBuilder()
        
        for (i in ingredient.indices) {
            sb.append(ingredient[i].toString())
            
            if (sb.length >= 4 && sb.substring(sb.length - 4) == "1231") {
                sb.setLength(sb.length - 4)
                answer++
            }
        }
        
        return answer
    }
}