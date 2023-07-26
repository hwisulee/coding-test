import kotlin.math.pow

class Solution {
    fun solution(numbers: LongArray): LongArray {
        var answer: LongArray = longArrayOf()

        repeat(numbers.size) {
            var num = numbers[it]
            var temp = num
            var n = 0

            while (temp > 0) {
                if (temp % 2 == 0.toLong()) break
                temp /= 2
                n++
            }

            if (n == 0) num++
            else num = (num + 2.0.pow(n.toDouble()) - 2.0.pow((n - 1).toDouble())).toLong()
            answer += num
        }

        return answer
    }
}