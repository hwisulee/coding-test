import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = true
    val pattern = arrayOf('I', 'O', 'S', 'H', 'Z', 'X', 'N')
    readLine().let { str ->
        val cnt = str.filter { c ->
            pattern.any { it == c }
        }.length

        if (str.length != cnt) result = false
    }

    bw.write(if (result) "YES" else "NO")
    bw.flush()
    bw.close()
}