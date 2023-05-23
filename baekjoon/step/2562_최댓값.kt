import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val intarray = IntArray(9) { br.readLine().toInt() }

    bw.write("${intarray.max()}\n${intarray.indexOf(intarray.max()) + 1}")
    bw.flush()
    bw.close()
}