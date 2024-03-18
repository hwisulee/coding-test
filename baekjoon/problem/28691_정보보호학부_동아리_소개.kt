import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayOf("MatKor", "WiCys", "CyKor", "AlKor", "\$clear")
    readLine().also { input ->
        bw.write(arr.filter { it[0].toString() == input }.joinToString(""))
    }
    bw.flush()
    bw.close()
}