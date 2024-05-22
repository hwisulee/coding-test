import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        if (!(it[0] == '\"' && it[it.lastIndex] == '\"') || it.length <= 2) {
            bw.write("CE")
        } else {
            bw.write(it.removePrefix("\"").removeSuffix("\""))
        }
    }
    bw.flush()
    bw.close()
}