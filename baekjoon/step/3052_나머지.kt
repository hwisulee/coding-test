import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val intarray = IntArray(10) { 0 }

    for (i in intarray.indices) {
        intarray[i] = br.readLine().toInt()
    }

    bw.write("${intarray.map { it % 42 }.groupBy { it }.count()}")
    bw.flush()
    bw.close()
}