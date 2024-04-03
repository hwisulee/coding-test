import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = "No"
    val n = readLine().toInt()
    val nList = Array<String>(n) { readLine() }
    val arr = arrayOf("Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you", "Never gonna make you cry", "Never gonna say goodbye", "Never gonna tell a lie and hurt you", "Never gonna stop")
    for (i in nList) {
        if (!arr.contains(i)) {
            result = "Yes"
            break
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}