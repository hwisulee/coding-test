import kotlin.math.abs

class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var leftNum = 10
        var rightNum = 12
        
        numbers.forEach {
            val next = if (it == 0) 11 else it
            
            when (next % 3) {
                0 -> {
                    answer += "R"
                    rightNum = next
                }
                
                1 -> {
                    answer += "L"
                    leftNum = next
                }
                
                2 -> {
                    when (distanceCheck(leftNum, next).compareTo(distanceCheck(rightNum, next))) {
                        -1 -> {
                            answer += "L"
                            leftNum = next
                        }
                        
                        1 -> {
                            answer += "R"
                            rightNum = next
                        }
                        
                        0 -> {
                            if (hand == "left") {
                                answer += "L"
                                leftNum = next
                            } else {
                                answer += "R"
                                rightNum = next
                            }
                        }
                    }
                }
            }
        }
        return answer.toString()
    }
}

fun distanceCheck(now: Int, next: Int): Int = abs(((now - 1) % 3 - (next - 1) % 3)) + abs((now - 1) / 3 - (next - 1) / 3)