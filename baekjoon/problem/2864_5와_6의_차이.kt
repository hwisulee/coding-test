import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    var min = 0
    val str = readLine()
    if (str.contains("5") || str.contains("6")) {
        max = str.replace("5", "6").split(" ").sumOf { it.toInt() }
        min = str.replace("6", "5").split(" ").sumOf { it.toInt() }
    }

    bw.write("$min $max")
    bw.flush()
    bw.close()
}