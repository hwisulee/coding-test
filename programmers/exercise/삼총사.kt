class Solution {
    var answer = 0
    
    fun solution(number: IntArray): Int {
        combination(0, 3, 0, number, mutableListOf())
        return answer
    }
    
    fun combination(cnt: Int, depth: Int, startAt: Int, arr: IntArray, temp: MutableList<Int>) {
        if (cnt == depth) {
            if (temp.sum() == 0) {
                answer++
            }
        } else {
            for (i in startAt until arr.size) {
                temp.add(arr[i])
                combination(cnt + 1, depth, i + 1, arr, temp)
                temp.removeAt(temp.lastIndex)
            }
        }
    }
}