import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { "" }
    repeat(n) {
        arr[it] = br.readLine()
    }

    arr.sortBy { it.split(" ")[0].toInt() }
    arr.forEach { bw.write("$it\n") }
    bw.flush()
    bw.close()
}