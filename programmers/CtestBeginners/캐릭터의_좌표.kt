import kotlin.math.abs

fun main(args: Array<String>) {
    println(solution(arrayOf("left", "left", "left", "left", "right", "right", "right", "right"), intArrayOf(5, 5)))
}

fun solution(keyinput: Array<String>, board: IntArray): IntArray {
    var i = 0
    var x = 0
    var y = 0
    var xMax = (board[0] - 1) / 2
    var yMax = (board[1] - 1) / 2

    while (i < keyinput.size) {
        if (keyinput[i] == "up") y++
        if (keyinput[i] == "down") y--
        if (keyinput[i] == "right") x++
        if (keyinput[i] == "left") x--
        if (abs(x) > xMax) x = if (x > 0) xMax else -xMax
        if (abs(y) > yMax) y = if (abs(y) > yMax && y > 0) yMax else -yMax
        i++
    }
    return intArrayOf(x, y)
}