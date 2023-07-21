class Solution {
    var answer = 0
    var switch = false

    fun solution(word: String): Int {
        val dic = arrayOf("A", "E", "I", "O", "U")
        dfs(0, "", word, dic)

        return answer
    }

    fun dfs(depth: Int, next: String, target: String, dic: Array<String>) {
        if (depth == 6) return
        if (next == target) { switch = true; return }

        for (word in dic) {
            if (switch) return
            if (depth + 1 < 6) answer++
            dfs(depth + 1, next.plus(word), target, dic)
        }
    }
}