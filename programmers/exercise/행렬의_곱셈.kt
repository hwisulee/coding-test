class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) { IntArray(arr2[0].size) }

        repeat(arr1.size) { i ->
            repeat(arr2[0].size) { j ->
                repeat(arr2.size) { k ->
                    answer[i][j] += arr1[i][k] * arr2[k][j]
                }
            }
        }

        return answer
    }
}