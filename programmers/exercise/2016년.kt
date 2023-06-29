class Solution {
    fun solution(a: Int, b: Int): String {
        val month = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val day = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")
        
        
        return try { day[((month.sliceArray(0 until a - 1).sum() + b) % 7) - 1] } catch(_: Exception) { "THU" }
    }
}