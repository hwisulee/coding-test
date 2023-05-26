import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val g = Array(100) { BooleanArray(100) }

    for (i in 0 until br.readLine().toInt()) {
        val (x1, y1) = br.readLine().split(" ").map { it.toInt() }

        repeat(10) { x2 ->
            repeat(10) { y2 ->
                g[x1 + x2][y1 + y2] = true
            }
        }
    }

    bw.write("${g.sumOf { it.count { it } } }")
    bw.flush()
    bw.close()
}