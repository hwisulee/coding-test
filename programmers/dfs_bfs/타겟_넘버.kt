class Solution {
    var answer = 0
    
    fun solution(numbers: IntArray, target: Int): Int {    
        dfs(0, 0, numbers, numbers.size, target)
        return answer
    }
    
    fun dfs(index: Int, result: Int, numbers: IntArray, size: Int, target: Int) {
        if (index == size) {
            if (result == target) answer++
        } else {
            dfs(index + 1, result + numbers[index], numbers, size, target)
            dfs(index + 1, result - numbers[index], numbers, size, target)
        }
    }
}