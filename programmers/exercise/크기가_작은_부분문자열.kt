class Solution {
    fun solution(t: String, p: String): Int {
        var arr = emptyArray<String>()
        
        for (i in t.indices) {
            val lastIdx = p.length + i - 1
            
            if (lastIdx < t.length) {
                arr += t.slice(i .. lastIdx)
            }
        }
        
        return arr.count { it.toLong() <= p.toLong() }
    }
}