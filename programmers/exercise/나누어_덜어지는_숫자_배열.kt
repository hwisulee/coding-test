class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val newArr = arr.filter { it % divisor == 0 }.sorted()
        
        return if (newArr.isEmpty()) intArrayOf(-1) else newArr.toIntArray()
    }
}