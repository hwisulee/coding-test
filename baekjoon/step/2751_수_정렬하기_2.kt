import java.io.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = ArrayList<Int>()
    repeat(br.readLine().toInt()) {
        arr.add(br.readLine().toInt())
    }

    arr.sort()

    val sb = StringBuilder()
    for (i in arr) {
        sb.append(i).append("\n")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}