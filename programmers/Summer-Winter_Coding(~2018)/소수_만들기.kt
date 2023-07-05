import kotlin.math.sqrt

class Solution {
    var answer = 0
    
    fun solution(nums: IntArray): Int {
        combination(0, 3, 0, nums, mutableListOf())
        return answer
    }
    
    fun combination(cnt: Int, depth: Int, startAt: Int, arr: IntArray, temp: MutableList<Int>) {
        if (cnt == depth) {
            if (isPrime(temp.sum())) answer++
        } else {
            for (i in startAt until arr.size) {
                temp.add(arr[i])
                combination(cnt + 1, depth, i + 1, arr, temp)
                temp.removeAt(temp.lastIndex)
            }
        }
    }
    
    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false
        return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0 }
    }
}