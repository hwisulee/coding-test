import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().lowercase()
        .replace("b", "v")
        .replace("y", "u")
        .replace("h", "n")
        .replace("p", "r")
        .replace("c", "s")
        .replace("x", "h")
        .replace("e", "ye")

    bw.write(input)
    bw.flush()
    bw.close()
}