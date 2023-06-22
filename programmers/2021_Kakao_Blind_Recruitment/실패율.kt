data class StageData (val num: Int, val failed: Double)

class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        val stageList = arrayListOf<StageData>()
        
        repeat(N) { key ->
            var failed = stages.count { it == (key + 1) }.toDouble() / stages.count { it >= (key + 1) }.toDouble()
            
            if (failed.isNaN()) failed = 0.0
            stageList.add(StageData(key + 1, failed))
        }
        stageList.sortedWith(compareByDescending<StageData> { it.failed }.thenBy { it.num }).forEach { answer += it.num }

        return answer
    }
}