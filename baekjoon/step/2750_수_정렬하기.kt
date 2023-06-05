import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = emptyArray<Int>()
    repeat(br.readLine().toInt()) {
        arr += br.readLine().toInt()
    }

    bw.write(arr.sorted().joinToString("\n"))
    bw.flush()
    bw.close()
}