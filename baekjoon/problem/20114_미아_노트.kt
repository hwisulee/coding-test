import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, h, w) = readLine().split(" ").map { it.toInt() }
    val list = mutableListOf<String>()
    val arr = Array(n) { "?" }
    repeat(h) {
        readLine().chunked(w).forEach {
            list += it
        }
    }

    val sb = StringBuilder()
    list.chunked(n).also {
        it.map {
            it.map {
                val temp = it.replace("?", "")
                sb.append(if (temp.isEmpty()) "?" else temp[0])
            }


            sb.forEachIndexed { index, c ->
                if (c != '?') {
                    arr[index] = c.toString()
                }
            }
            sb.clear()
        }
    }

    bw.write(arr.joinToString(""))
    bw.flush()
    bw.close()
}