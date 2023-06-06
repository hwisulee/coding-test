import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr1 = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    val arr2 = br.readLine().split(" ").map { it.toInt() }
    val list = MutableList(20000002) { 0 }

    arr1.forEach { list[it + 10000000] += 1 }
    arr2.forEach { bw.append("${list[it + 10000000]} ") }
    bw.flush()
    bw.close()
}