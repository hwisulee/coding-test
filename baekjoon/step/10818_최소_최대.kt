import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    val intarray = br.readLine().split(" ").map { it.toInt() }
    
    bw.write("${intarray.min()} ${intarray.max()}")
    bw.flush()
    bw.close()
}