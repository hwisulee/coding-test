import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ")
    var cnt = 0
    (0 until n.toInt() + 1).forEach { h ->
        val strH = if (h < 10) "0$h" else h.toString()
        (0 until 60).forEach { m ->
            val strM = if (m < 10) "0$m" else m.toString()
            (0 until 60).forEach { s ->
                val strS = if (s < 10) "0$s" else s.toString()
                if (strH.contains(k) or strM.contains(k) or strS.contains(k)) cnt++
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}