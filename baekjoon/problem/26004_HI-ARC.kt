import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    readLine().groupingBy { it }.eachCount().filter {
        it.key == 'H' || it.key == 'I' || it.key == 'A'  || it.key == 'R'  || it.key == 'C'
    }.values.also {
        bw.write(if (it.size == 5) "${it.min()}" else "0")
    }

    bw.flush()
    bw.close()
}