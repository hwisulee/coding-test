import kotlin.math.sqrt

class Solution {
    fun solution(n: Int, k: Int): Int {
        var answer: Int = 0
        val arr = n.toString(k).split("0").filter { it.isNotEmpty() }.map { it.toLong() }
        repeat(arr.size) { if (isPrime(arr[it])) answer++ }

        return answer
    }

    fun isPrime(n: Long): Boolean {
        if (n <= 1) return false
        return (2 .. sqrt(n.toDouble()).toLong()).none { n % it == 0.toLong() }
    }
}