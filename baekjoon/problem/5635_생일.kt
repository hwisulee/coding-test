import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Log(val name: String, val day: Int, val month: Int, val year: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = mutableListOf<Log>()
    repeat(n) {
        readLine().also {
            val (name, day, month, year) = it.split(" ")
            list += Log(name, day.toInt(), month.toInt(), year.toInt())
        }
    }

    list.sortWith(compareBy<Log> { it.year }.thenBy { it.month }.thenBy { it.day })
    bw.write("${list[list.lastIndex].name}\n${list[0].name}")
    bw.flush()
    bw.close()
}