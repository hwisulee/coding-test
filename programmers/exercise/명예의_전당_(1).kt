class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var arr = intArrayOf()
        var answer: IntArray = intArrayOf()
        
        repeat(score.size) {
            if (arr.size >= k) {
                if (score[it] > arr[0]) {
                    arr = arr.sliceArray(1 .. arr.lastIndex)
                    arr += score[it]
                }
            } else {
                arr += score[it]
            }
            
            arr.sort()
            answer += arr.minOf { it }
        }
        return answer
    }
}