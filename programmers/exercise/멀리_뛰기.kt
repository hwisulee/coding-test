class Solution {
    fun solution(n: Int): Long {
        val arr = LongArray(n + 1)

        for (i in 0 .. 1) arr[i] = 1

        return if (n < 2) {
            arr[n]
        } else {
            (2 .. n).forEach { arr[it] = (arr[it - 1] + arr[it - 2]) % 1234567 }
            arr[n]
        }
    }
}