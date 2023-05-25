import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dic = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var word = br.readLine()

    dic.forEach { word = word.replace(it, "0") }

    bw.write("${word.length}")
    bw.flush()
    bw.close()
}