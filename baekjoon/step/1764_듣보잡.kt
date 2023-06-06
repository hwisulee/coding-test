import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr1 = Array(n) { br.readLine() }
    val arr2 = Array(m) { br.readLine() }.toMutableSet()
    val arr3 = arr1.intersect(arr2)

    bw.appendLine("${arr3.size}").append(arr3.sorted().joinToString("\n"))
    bw.flush()
    bw.close()
}