import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nowDate: Int
    readLine().split("-").map { it.toInt() }.apply {
        nowDate = this[0] * 10000 + this[1] * 100 + this[2]
    }

    val list = Array(readLine().toInt()) {
        val temp = readLine().split("-").map { it.toInt() }
        temp[0] * 10000 + temp[1] * 100 + temp[2]
    }

    bw.write("${list.count { it >= nowDate }}")
    bw.flush()
    bw.close()
}