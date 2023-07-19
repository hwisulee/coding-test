class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val day = progresses.mapIndexed { index, i -> if ((100 - i) % speeds[index] != 0) ((100 - i) / speeds[index]) + 1 else ((100 - i) / speeds[index]) }.toMutableList()

        var cnt = 1
        day.forEachIndexed { index, i ->
            if (i == 0) return@forEachIndexed
            for (it in index + 1 until day.size) {
                if (i >= day[it]) {
                    day[it] = 0
                    cnt++
                } else {
                    break
                }
            }

            answer += cnt
            cnt = 1
        }

        return answer
    }
}