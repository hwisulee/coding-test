class Solution {
    fun solution(num: Int): Int {
        var cnt = 0
        var a = num.toLong()
        while (true) {
            if (a == 1.toLong()) break
            if (a % 2 == 0.toLong()) a /= 2 else a = a * 3 + 1
            if (cnt >= 500) {
                cnt = -1
                break
            }

            cnt++
        }

        return cnt
    }
}