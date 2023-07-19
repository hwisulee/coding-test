var answer: Int = 0

class Solution {
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        permutation(k, 0, BooleanArray(dungeons.size), dungeons)
        return answer
    }

    fun permutation(cur: Int, cnt: Int, visited: BooleanArray, arr: Array<IntArray>) {
        if (cnt == arr.size) {
            answer = answer.coerceAtLeast(cnt)
        }

        for (i in arr.indices) {
            if (visited[i]) continue
            if (cur < arr[i][0]) {
                answer = answer.coerceAtLeast(cnt)
                continue
            }

            visited[i] = true
            permutation(cur - arr[i][1], cnt + 1, visited, arr)
            visited[i] = false
        }
    }
}