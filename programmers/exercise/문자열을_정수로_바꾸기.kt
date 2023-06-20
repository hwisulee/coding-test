class Solution {
    fun solution(s: String): Int {
        return if (s.contains("-")) {
            -s.filterNot { it == '-' }.toInt()
        } else {
            s.toInt()
        }
    }
}