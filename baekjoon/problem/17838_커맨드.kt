import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    for (i in 0 until t) {
        val input = readLine()
        val group = input.groupingBy { it }.eachCount()

        if (input.length == 7 && group.size == 2) {
            val keys = group.keys.map { it }
            val temp = input.replace(keys[0], '0').replace(keys[1], '1')

            if ("0011011" == temp) bw.appendLine("1") else bw.appendLine("0")
        } else {
            bw.appendLine("0")
        }
    }

    bw.flush()
    bw.close()
}