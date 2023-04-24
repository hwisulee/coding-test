class Solution {
    fun solution(my_string: String): Int = my_string.split("[A-z]+".toRegex()).filter { it.isNotEmpty() }.sumOf { it.toInt() }
}