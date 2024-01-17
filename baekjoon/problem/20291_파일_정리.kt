import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class File(val name: String, val extension: String)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var arr = arrayOf<File>()
    repeat(n) {
        val (name, extension) = readLine().split(".")
        arr += File(name, extension)
    }

    bw.write(arr.groupingBy { it.extension }.eachCount().toSortedMap(compareBy { it }).map { it }.joinToString("\n").replace("=", " "))
    bw.flush()
    bw.close()
}