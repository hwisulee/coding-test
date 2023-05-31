import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var yMax = -10001
    var yMin = 10001
    var xMin = 10001
    var xMax = -10001

    for (i in 1 .. br.readLine().toInt()) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        yMax = yMax.coerceAtLeast(y)
        yMin = yMin.coerceAtMost(y)
        xMax = xMax.coerceAtLeast(x)
        xMin = xMin.coerceAtMost(x)
    }

    bw.write("${(xMax - xMin) * (yMax - yMin)}")
    bw.flush()
    bw.close()
}