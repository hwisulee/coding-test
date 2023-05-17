class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val strings = Array(park.size) { park[it] }
        var x = 0
        var y = 0

        for (i in strings.indices) {
            for (j in strings[0].indices) {
                if (strings[i][j] == 'S') {
                    x = j
                    y = i
                    break
                }
            }
        }
        for (s in routes) {
            val array = s.split(" ")
            val dir = array[0]
            val count = array[1].toInt()

            for (k in 0 until count) {
                when (dir) {
                    "N" -> {
                        if (y <= 0 || strings[y - 1][x] == 'X') {
                            y += k
                            break
                        }
                        y--
                    }
                    "S" -> {
                        if (y >= strings.size - 1 || strings[y + 1][x] == 'X') {
                            y -= k
                            break
                        }
                        y++
                    }
                    "E" -> {
                        if (x >= strings[0].length - 1 || strings[y][x + 1] == 'X') {
                            x -= k
                            break
                        }
                        x++
                    }
                    "W" -> {
                        if (x <= 0 || strings[y][x - 1] == 'X') {
                            x += k
                            break
                        }
                        x--
                    }
                }
            }
        }
        return intArrayOf(y, x)
    }
}