import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayListOf("baby", "sukhwan", "tururu", "turu", "very", "cute", "tururu", "turu", "in", "bed", "tururu", "turu", "baby", "sukhwan")
    val n = readLine().toInt()

    var result = ""
    val idx = if (n % 14 - 1 >= 0) n % 14 - 1 else 14 + (n % 14 - 1)
    arr[idx].also {
        val repeatIdx = n / 14
        result = if (it == "tururu" || it == "turu") {
            val now = it + "ru".repeat(repeatIdx)
            val cnt = now.replace("ru", "0").count { it == '0' }

            if (cnt >= 5) {
                "tu+ru*$cnt"
            } else {
                now
            }
        } else it
    }

    bw.write(result)
    bw.flush()
    bw.close()
}