import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer: Int = 0
        var basket: Stack<Int> = Stack<Int>()

        moves.forEach {
            for (i in board.indices) {
                if(board[i][it - 1] != 0) {
                    if(!basket.empty() && basket.peek() == board[i][it -1 ]) {
                        answer += 2
                        basket.pop()
                    } else {
                        basket.push(board[i][it - 1])
                    }
                    
                    board[i][it-1] = 0
                    break
                }
            }
        }

        return answer
    }
}