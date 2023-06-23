class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int = absolutes.mapIndexed { index, i -> if (signs[index]) i else -i }.sum()
}