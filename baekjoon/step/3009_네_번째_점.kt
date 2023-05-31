import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var x = emptyArray<Int>()
    var y = emptyArray<Int>()
    
    repeat(3) {
        val point = br.readLine().split(" ").map { it.toInt() }

        x += point[0]
        y += point[1]
    }

    var xy = emptyArray<Int>()
    xy += x.groupBy { it }.values.filter { it.size < 2 }.flatten()
    xy += y.groupBy { it }.values.filter { it.size < 2 }.flatten()

    bw.write(xy.joinToString(" "))
    bw.flush()
    bw.close()
}