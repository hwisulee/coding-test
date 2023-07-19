import java.util.*

data class Lists(val p: Int, val i: Int)

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue : Queue<Lists> = LinkedList()
        repeat(priorities.size) { queue.add(Lists(priorities[it], it)) }

        var answer = 0
        while (true) {
            val now = queue.poll()

            if (queue.any { now.p < it.p }) {
                queue.add(now)
            } else {
                answer++

                if (now.i == location) break
            }
        }

        return answer
    }
}