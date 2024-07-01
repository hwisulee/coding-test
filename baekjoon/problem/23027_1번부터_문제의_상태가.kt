import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        val check = BooleanArray(3)
        if (it.contains('A')) check[0] = true
        if (it.contains('B')) check[1] = true
        if (it.contains('C')) check[2] = true

        StringBuilder(it).apply {
            val result = when {
                !check[0] && check[1] -> replace("[CDF]".toRegex(), "B")
                !check[0] && !check[1] && check[2] -> replace("[DF]".toRegex(), "C")
                !check[0] && !check[1] && !check[2] -> replace("[A-Z]".toRegex(), "A")
                check[0] -> replace("[BCDF]".toRegex(), "A")
                else -> it
            }

            bw.write(result)
        }
    }
    bw.flush()
    bw.close()
}