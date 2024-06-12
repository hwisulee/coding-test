import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val note = mutableListOf<String>()
    val map = Array(r) { readLine() }

    for (i in map.indices) {
        map[i].split("#").filter { it.length >= 2 }.forEach {
            note += it
        }
    }

    for (j in 0 until c) {
        val sb = StringBuilder()

        for (i in map.indices) {
            sb.append(map[i][j])
        }

        sb.split("#").filter { it.length >= 2 }.forEach {
            note += it
        }
    }

    bw.write(note.sorted()[0])
    bw.flush()
    bw.close()
}