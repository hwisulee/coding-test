import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val schedule = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        schedule.add(Pair(x, y))
    }

    schedule.sortWith(compareBy<Pair<Int, Int>> { it.second }.thenBy { it.first })
    var endTime = schedule[0].second
    var cnt = 1

    for (i in 1 until schedule.size) {
        if (endTime <= schedule[i].first) {
            endTime = schedule[i].second
            cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}