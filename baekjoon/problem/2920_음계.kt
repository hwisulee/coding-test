import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = br.readLine().split(" ").map { it.toInt() }
    when (arr) {
        arr.sorted() -> bw.write("ascending")
        arr.sortedDescending() -> bw.write("descending")
        else -> bw.write("mixed")
    }
    bw.flush()
    bw.close()
}