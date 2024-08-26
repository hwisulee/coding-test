import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine()
        .split(" ")
        .map { it.toInt() }

    val musicList = MutableList<Music>(n) {
        val cur = readLine().split(" ")
        val notes = cur.subList(cur.size - 7, cur.size).joinToString(" ")
        Music(cur[0].toInt(), cur[1], notes)
    }

    repeat(m) {
        val cur = readLine()
        val filtered = musicList.filter { it.notes.startsWith(cur) }

        if (filtered.size == 1) {
            bw.write(filtered[0].titleName)
        } else if (filtered.isEmpty()) {
            bw.write("!")
        } else {
            bw.write("?")
        }
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

data class Music(
    val titleLength: Int,
    val titleName: String,
    val notes: String
)