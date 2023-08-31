import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = ""
    val n = br.readLine().toInt()
    val files = mutableListOf<String>()
    repeat(n) { files.add(br.readLine()) }

    val length = files[0].length
    for (i in 0 until length) {
        var checker = true
        val temp = files[0][i]

        for (j in 0 until files.size) {
            val now = files[j][i]
            if (now != temp) { checker = false; break; }
        }

        if (checker) result += temp else result += "?"
    }

    bw.write(result)
    bw.flush()
    bw.close()
}