class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        arr.forEach { answer = ((answer * it) / gcd(answer, it))}
        return answer
    }
    
    fun gcd(a: Int, b: Int): Int = if (a < b) if (a != 0) gcd(a, b % a) else b else if (b != 0) gcd(b, a % b) else a
}