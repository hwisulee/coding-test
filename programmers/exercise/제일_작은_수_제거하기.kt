class Solution {
    fun solution(arr: IntArray): IntArray {
        val newArr = arr.filter { it != arr.minOf { it } }.toIntArray()
        return if (newArr.isEmpty()) intArrayOf(-1) else newArr
    }
}