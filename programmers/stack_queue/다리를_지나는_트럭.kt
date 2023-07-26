import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val runningQueue: Queue<Int> = LinkedList<Int>()
        val waittingQueue: Queue<Int> = LinkedList<Int>()

        for (i in 0 until bridge_length) runningQueue.add(0)
        for (i in truck_weights) waittingQueue.add(i)

        while (runningQueue.isNotEmpty()) {
            answer++
            runningQueue.poll()

            if (waittingQueue.isNotEmpty()) {
                if (runningQueue.sum() <= weight - waittingQueue.peek()) runningQueue.add(waittingQueue.poll())
                else runningQueue.add(0)
            }
        }

        return answer
    }
}