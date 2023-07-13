import java.util.*

class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        repeat(s.length) { i ->
            val stack = Stack<Char>()
            val str = s.substring(i, s.length) + s.substring(0, i)

            repeat(str.length) { j ->
                when {
                    stack.isEmpty() -> stack.push(str[j])
                    str[j] == ')' && stack.peek() == '(' -> stack.pop()
                    str[j] == '}' && stack.peek() == '{' -> stack.pop()
                    str[j] == ']' && stack.peek() == '[' -> stack.pop()
                    else -> stack.push(str[j])
                }
            }

            if (stack.isEmpty()) answer++
        }

        return answer
    }
}