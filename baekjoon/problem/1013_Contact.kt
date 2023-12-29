import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pattern = "(100+1+|01)+"
    val t = readLine().toInt()
    repeat(t) {
        val st = StringTokenizer(readLine())
        if (st.nextToken().matches(pattern.toRegex())) bw.appendLine("YES") else bw.appendLine("NO")
    }
    bw.flush()
    bw.close()
}