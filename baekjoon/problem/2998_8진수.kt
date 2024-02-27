import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val sb = StringBuilder()
    var result = ""
    sb.append(input)

    while (true) {
        if (sb.length % 3 == 0) break
        sb.insert(0, "0")
    }

    sb.chunked(3).forEach {
        result += when (it) {
            "001" -> 1
            "010" -> 2
            "011" -> 3
            "100" -> 4
            "101" -> 5
            "110" -> 6
            "111" -> 7
            else -> 0
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}