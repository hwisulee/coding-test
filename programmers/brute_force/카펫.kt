class Solution {
    fun solution(brown: Int, yellow: Int): IntArray = (1 .. yellow).first { (yellow % it == 0) && ((yellow / it + it) * 2 + 4 == brown) }.let { intArrayOf(yellow / it + 2, it + 2) }
}