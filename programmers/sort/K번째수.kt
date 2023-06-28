class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
        repeat(commands.size) {
            val newArr = array.sliceArray((commands[it][0] - 1) .. (commands[it][1] - 1))
            answer += newArr.sortedArray()[commands[it][2] - 1]
        }
        
        return answer
    }
}