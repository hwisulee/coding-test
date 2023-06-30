class Solution {
    fun solution(answers: IntArray): IntArray {
        val answer = intArrayOf(0, 0, 0)
        val testerAns = arrayOf(intArrayOf(1, 2, 3, 4, 5), intArrayOf(2, 1, 2, 3, 2, 4, 2, 5), intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5))
        
        testerAns.forEachIndexed { i, it1 -> answer[i] += answers.filterIndexed { j, it2 -> it2 == it1[j % it1.size] }.count() }
        
        return answer.mapIndexed { i, it -> if (it >= answer.maxOf {it}) i + 1 else 0 }.filter { it != 0 }.toIntArray()
    }
}