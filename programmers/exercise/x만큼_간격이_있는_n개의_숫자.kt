import kotlin.math.abs

class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var temp = x.toLong()

        return try {
            (temp .. temp * n).step(temp).map { it }.toLongArray()
        } catch (_: Exception) {
            temp = abs(x).toLong()

            if (x == 0) {
                LongArray(n) { 0 }
            } else {
                (temp .. temp * n).step(temp).map { -it }.toLongArray()
            }
        }
    }
}