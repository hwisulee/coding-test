import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Record(val m: Int, val s: Int, val sss: Int, val team: String)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val score = IntArray(2)
    val list = MutableList(8) {
        val (time, cur) = readLine().split(" ").map { it }
        val (m, s, sss) = time.split(":").map { it.toInt() }
        Record(m, s, sss, cur)
    }.sortedWith(compareBy<Record> { it.m }.thenBy { it.s }.thenBy { it.sss })

    list.forEachIndexed { index, record ->
        if (record.team == "R") score[0] += addScore(index) else score[1] += addScore(index)
    }

    bw.write(if (score[0] > score[1]) "Red" else "Blue")
    bw.flush()
    bw.close()
}

fun addScore(index: Int): Int {
    return when (index) {
        0 -> 10
        1 -> 8
        2 -> 6
        3 -> 5
        4 -> 4
        5 -> 3
        6 -> 2
        7 -> 1
        8 -> 0
        else -> -99
    }
}