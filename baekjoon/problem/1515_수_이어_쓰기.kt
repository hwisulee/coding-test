import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cur = 0
    var index = 0
    val n = readLine()
    while (cur++ <= 30000) {
        val temp = cur.toString()
        for (i in temp.indices) {
            if (temp[i] == n[index]) index++
            if (index == n.length) {
                bw.write("$cur")
                bw.flush()
                bw.close()
                exitProcess(0)
            }
        }
    }
}