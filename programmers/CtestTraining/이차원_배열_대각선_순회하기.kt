fun main(args: Array<String>) {
    println(solution(arrayOf(intArrayOf(0, 1, 2), intArrayOf(1, 2, 3), intArrayOf(2, 3, 4), intArrayOf(3, 4, 5)), 2))
}

fun solution(board: Array<IntArray>, k: Int): Int = board.indices.sumOf { i -> board[i].indices.filter { j -> i + j <= k }.sumOf { j -> board[i][j] } }