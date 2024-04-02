import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val p = readLine().toInt()
    repeat(p) {
        val result = IntArray(8) { 0 }
        val input = readLine()
        for (i in 2 until input.length) {
            val cur = input.slice(i - 2 .. i)
            when (cur) {
                "TTT" -> result[0]++
                "TTH" -> result[1]++
                "THT" -> result[2]++
                "THH" -> result[3]++
                "HTT" -> result[4]++
                "HTH" -> result[5]++
                "HHT" -> result[6]++
                "HHH" -> result[7]++
            }
        }

        bw.write(result.joinToString(" "))
        if (it < p) bw.append("\n")
        bw.flush()
    }

    bw.close()
}