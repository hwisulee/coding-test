import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    var input: String?
    while (true) {
        input = readLine()
        if (input.isNullOrEmpty()) break

        input.split(" ").also {
            if (it[0] == "Es") result += it[1].toInt() * 21
            if (it[0] == "Stair") result += it[1].toInt() * 17
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}