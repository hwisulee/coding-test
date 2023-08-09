import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(12)
    for (i in 0 .. 3) { if (i == 3) arr[i] = 4 else arr[i] = i }
    for (i in 4 until arr.size) { arr[i] = arr[i - 1] + arr[i - 2] + arr[i -3] }
    repeat(br.readLine().toInt()) { bw.appendLine("${arr[br.readLine().toInt()]}") }
    bw.flush()
    bw.close()
}