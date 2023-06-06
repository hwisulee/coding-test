import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val s = Array(n) { br.readLine() }.toHashSet()
    val arr = Array(m) { br.readLine() }
    var cnt = 0
    arr.forEach { if (s.contains(it)) cnt += 1 }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}