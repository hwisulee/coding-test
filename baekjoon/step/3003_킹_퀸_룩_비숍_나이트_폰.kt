import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val current = intArrayOf(1, 1, 2, 2, 2, 8)
    val find = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    bw.write(find.indices.map { if (find[it] == current[it]) 0 else current[it] - find[it] }.joinToString(" "))
    bw.flush()
    bw.close()
}