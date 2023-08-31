import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringBuilder()
    while (true) {
        val case = br.readLine()

        if (case == "0 0") break
        else {
            case.split(" ").map { it.toInt() }.also {
                if (it[0] > it[1]) st.appendLine("Yes") else st.appendLine("No")
            }
        }
    }
    bw.write(st.toString())
    bw.flush()
    bw.close()
}