import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var str = readLine()
    while (true) {
        if (str.contains("PS4") || str.contains("PS5")) {
            str = str.replace("PS4|PS5".toRegex(), "PS")
        } else {
            break
        }
    }

    bw.write(str)
    bw.flush()
    bw.close()
}