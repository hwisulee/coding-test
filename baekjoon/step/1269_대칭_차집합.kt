import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val a = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val b = br.readLine().split(" ").map { it.toInt() }.toMutableSet()
    val arr1 = a.subtract(b).size
    val arr2 = b.subtract(a).size

    bw.write("${arr1 + arr2}")
    bw.flush()
    bw.close()
}