import java.util.Stack

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = IntArray(numbers.size) { -1 }
        val stack = Stack<Int>()

        var index = 0
        numbers.forEachIndexed { i, it ->
            while (index <= i) {
                val topNum = if (stack.isNotEmpty()) stack[stack.lastIndex] else -1

                when {
                    stack.isEmpty() || it <= numbers[topNum] -> stack.add(index++)
                    else -> {
                        answer[topNum] = it
                        stack.removeLast()
                    }
                }
            }
        }

        return answer
    }
}