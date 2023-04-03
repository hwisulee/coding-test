class Solution {
    fun solution(board: Array<IntArray>): Int {
        return board.indices.map { row ->
            board[row].indices.filter { board[row][it] == 1 }.forEach { col ->
                ((row - 1).coerceAtLeast(0)..(row + 1).coerceAtMost(board.lastIndex)).map { row2 ->
                    ((col - 1).coerceAtLeast(0)..(col + 1).coerceAtMost(board.first().lastIndex)).forEach { col2 ->
                        if (board[row2][col2] == 0) {
                            board[row2][col2] = 2
                        }
                    }
                }
            }
        }.run { board.indices.map { board[it].count { value -> value == 0 } } }.sum()
    }
}