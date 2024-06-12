import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    bw.write(readLine().filterNot { it == 'J' || it == 'A' || it == 'V' }.ifEmpty { "nojava" })
    bw.flush()
    bw.close()
}