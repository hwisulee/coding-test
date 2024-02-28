import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Team(val team: String, val percentage: Int)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(4) { 0 }.also { sorter(readLine(), it) }
    val n = readLine().toInt()
    val team = mutableListOf<Team>()
    repeat(n) {
        val name = readLine()
        val temp = arr.copyOf().also { sorter(name, it) }
        val sum = (temp[0] + temp[1]) * (temp[0] + temp[2]) * (temp[0] + temp[3]) * (temp[1] + temp[2]) * (temp[1] + temp[3]) * (temp[2] + temp[3])
        team += Team(name, sum.mod(100))
    }

    team.sortWith(compareByDescending<Team> { it.percentage }.thenBy { it.team })
    bw.write(team[0].team)
    bw.flush()
    bw.close()
}

fun sorter(input: String, arr: IntArray): IntArray {
    input.forEach {
        when (it) {
            'L' -> arr[0]++
            'O' -> arr[1]++
            'V' -> arr[2]++
            'E' -> arr[3]++
        }
    }

    return arr
}