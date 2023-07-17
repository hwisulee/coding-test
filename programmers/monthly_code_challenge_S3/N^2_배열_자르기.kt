class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val arr = IntArray((right - left).toInt() + 1)
        var index = left

        repeat(arr.size) {
            val x = (index / n.toLong()).toInt()
            val y = (index % n.toLong()).toInt()

            arr[it] = x.coerceAtLeast(y) + 1
            index++
        }

        return arr
    }
}