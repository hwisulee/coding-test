import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var arr = HashSet<String>()
    var cnt = 0

    repeat(n) {
        br.readLine().also {
            if (it == "ENTER") {
                arr = HashSet()
                return@repeat
            }
            if (arr.add(it)) cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}