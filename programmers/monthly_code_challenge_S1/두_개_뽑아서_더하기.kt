class Solution {
    var answer: IntArray = intArrayOf()
    
    fun solution(numbers: IntArray): IntArray {
        combination(0, 2, 0, numbers, mutableListOf())
        return answer.distinct().sorted().toIntArray()
    }
    
    fun combination(cnt: Int, depth: Int, startAt: Int, arr: IntArray, temp: MutableList<Int>) {
        if (cnt == depth) {
            answer += temp.sum()
        } else {
            for (i in startAt until arr.size) {
                temp.add(arr[i])
                combination(cnt + 1, depth, i + 1, arr, temp)
                temp.removeAt(temp.lastIndex)
            }
        }
    }
}