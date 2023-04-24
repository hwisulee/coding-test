fun main(args: Array<String>) {
    println(solution(4))
}

fun solution(n: Int): Array<IntArray> {
    val arr = Array(n) { IntArray(n) }

    var up = 1
    var left = 0
    var right = n - 1
    var down = n - 1

    var di = intArrayOf(0, 1, 0, -1)
    var dj = intArrayOf(1, 0, -1, 0)
    var direction = 0

    var i = 0
    var j = 0
    arr[i][j] = 1

    for (cnt in 1 .. n * n) {
        arr[i][j] = cnt

        if (direction % 4 == 3 && i == up) {
            direction += 1
            up += 1
        } else if (direction % 4 == 2 && j == left) {
            direction += 1
            left += 1
        } else if (direction % 4 == 0 && j == right) {
            direction += 1
            right -= 1
        } else if (direction % 4 == 1 && i == down) {
            direction += 1
            down -= 1
        }

        i += di[direction % 4]
        j += dj[direction % 4]
    }

    return arr
}