class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var arr = (1 .. number).map { getDivisor(it) }

        return arr.map { if (it > limit) power else it }.sum()
    }
    
    fun getDivisor(num: Int): Int {
        var cnt = 0
        
        var i = 1
        while (i * i <= num) {
            if (i * i == num) {
                cnt++
            } else if (num % i == 0) {
                cnt += 2
            }
            
            i++
        }
        
        return cnt
    }
}