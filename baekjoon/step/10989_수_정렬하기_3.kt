import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(n) { br.readLine().toInt() }
    arr.sort()
    br.close()
    arr.forEach { bw.write("$it\n") }
    bw.flush()
    bw.close()
}