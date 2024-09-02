import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = -1
    readLine().let { str ->
        str.replace(".", "").let {
            if (it == "@#!" || it == "!#@") {
                val robotIdx = str.indexOf("@")
                val destination = str.indexOf("!")
                cnt += abs(robotIdx - destination)
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}