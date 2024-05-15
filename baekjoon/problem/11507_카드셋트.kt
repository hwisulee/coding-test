import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val card = IntArray(4) { 13 }
    val input = readLine().chunked(3).let {
        if (it.distinct().size != it.size) {
            bw.write("GRESKA")
            bw.flush().also { close() }
            exitProcess(0)
        }

        it.groupingBy { it[0] }.eachCount()
    }

    input.forEach { (t, u) ->
        when (t) {
            'P' -> card[0] -= u
            'K' -> card[1] -= u
            'H' -> card[2] -= u
            'T' -> card[3] -= u
        }
    }

    bw.write(card.joinToString(" "))
    bw.flush()
    bw.close()
}