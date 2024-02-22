import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s = 0
    var check: Boolean
    val time = IntArray(4) { 0 }
    val toSecond = intArrayOf(600, 60, 0, 10, 1)
    val n = readLine().toInt()
    repeat(n) {
        val (team, goal) = readLine().split(" ")
        check = team == "1"
        for (i in 0 .. 4) {
            if (goal[i] == ':') continue
            time[3] += goal[i].digitToInt() * toSecond[i]
        }

        if (s > 0) time[1] += time[3] - time[0]
        if (s < 0) time[2] += time[3] - time[0]
        s += if (check) 1 else -1
        time[0] = time[3]
        time[3] = 0
    }
    if (s > 0) time[1] += 2880 - time[0]
    if (s < 0) time[2] += 2880 - time[0]

    bw.write(String.format("%02d:%02d\n%02d:%02d", time[1] / 60, time[1] % 60, time[2] / 60, time[2] % 60))
    bw.flush()
    bw.close()
}