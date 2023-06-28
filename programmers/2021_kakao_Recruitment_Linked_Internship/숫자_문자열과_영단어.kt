class Solution {
    fun solution(s: String): Int {
        val num_list = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var result = s
        
        num_list.forEachIndexed { i, it ->
            result = result.replace(it, "$i")
        }
        
        return result.toInt()
    }
}