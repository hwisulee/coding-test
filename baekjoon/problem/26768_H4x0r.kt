import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
        .replace('a', '4')
        .replace('e', '3')
        .replace('i', '1')
        .replace('o', '0')
        .replace('s', '5')

    bw.write(input)
    bw.flush()
    bw.close()
}