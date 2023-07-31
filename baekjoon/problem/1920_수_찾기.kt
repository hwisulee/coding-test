import java.io.*
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var st = StringTokenizer(br.readLine())
    val hash = HashSet<Int>()
    repeat(n) { hash.add(st.nextToken().toInt()) }

    n = br.readLine().toInt()
    st = StringTokenizer(br.readLine())

    val sb = StringBuilder()
    repeat(n) {if (hash.contains(st.nextToken().toInt())) sb.appendLine("1") else sb.appendLine("0") }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}