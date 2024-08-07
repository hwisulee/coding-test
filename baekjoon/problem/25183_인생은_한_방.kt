import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    for (i in 0 .. n - 5) {
        val temp = s.substring(i, i + 5)
        if ((0 .. 3).all { checkStr(temp[it], temp[it + 1]) }) {
            bw.write("YES")
            bw.flush()
            exitProcess(0)
        }
    }

    bw.write("NO")
    bw.flush()
    bw.close()
}

fun checkStr(a: Char, b: Char): Boolean = abs(a - b) == 1