class Solution {
    fun solution(s: String): IntArray {
        val answer: IntArray = intArrayOf(0, 0)

        var str = s
        while (true) {
            if (str == "1") break
            val cnt = str.count { it == '0' }

            str = str.count { it == '1' }.toString(2)

            answer[0] += 1
            answer[1] += cnt
        }

        return answer
    }
}