
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = arrayOf("Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex")
    val map = HashMap<String, Int>()
    var total = 0

    while (true) {
        try {
            val st = StringTokenizer(readLine())

            while (st.hasMoreTokens()) {
                val cur = st.nextToken()
                map[cur] = map.getOrDefault(cur, 0) + 1
                total++
            }
        } catch (_: Exception) {
            break
        }
    }

    list.forEach {
        val cnt = map.getOrDefault(it, 0)
        bw.appendLine("$it $cnt ${String.format("%.2f", cnt.toFloat() / total)}")
    }

    bw.write("Total $total 1.00")
    bw.flush()
    bw.close()
}
