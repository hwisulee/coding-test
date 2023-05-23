import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, x) = br.readLine().split(" ").map { it.toInt() }
    val intarray = br.readLine().split(" ").map { it.toInt() }

    bw.write(intarray.filter { it < x }.joinToString(" "))
    bw.flush()
    bw.close()
}