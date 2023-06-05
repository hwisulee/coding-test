import java.io.*

data class pair (val x: Int, val y: Int)

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val xy = Array<pair?>(n) { null }
    repeat(n) {
        val (xi, yi) = br.readLine().split(" ").map { it.toInt() }
        xy[it] = pair(xi, yi)
    }

    xy.sortWith(compareBy<pair?> { it!!.x }.thenBy { it!!.y })
    xy.forEach { bw.write("${it!!.x} ${it.y}\n") }
    bw.flush()
    bw.close()
}