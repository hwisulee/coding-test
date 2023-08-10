import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = LongArray(101)
    repeat(3) { arr[it + 1] = 1L }
    for (i in 4 .. 100) { arr[i] = arr[i - 3] + arr[i - 2] }

    val case = br.readLine().toInt()
    repeat(case) {
        val n = br.readLine().toInt()
        bw.appendLine("${arr[n]}")
    }
    bw.flush()
    bw.close()
}