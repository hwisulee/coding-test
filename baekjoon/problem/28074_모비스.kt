import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Char>()
    readLine().forEach {
        when (it) {
            'M', 'O', 'B', 'I', 'S' -> list += it
        }
    }

    bw.write(if (list.distinct().count() < 5) "NO" else "YES")
    bw.flush()
    bw.close()
}