import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = ""
    val base = arrayOf("KOREA", "YONSEI")
    val index = IntArray(2)
    for (it in readLine()) {
        if (base[0][index[0]] == it) index[0]++
        if (base[1][index[1]] == it) index[1]++
        when {
            index[0] == 5 -> {
                result = base[0]
                break
            }
            index[1] == 6 -> {
                result = base[1]
                break
            }
            else -> {
                continue
            }
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}