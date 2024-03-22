import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val numList = MutableList(3) { 0.toLong() }
        var status = ""
        readLine().split(" ").forEachIndexed { index, s ->
            when (s) {
                "+" -> status = "+"
                "-" -> status = "-"
                "*" -> status = "*"
                "/" -> status = "/"
                else -> if (index % 2 == 0) numList[index / 2] = s.toLong()
            }
        }

        val result = when (status) {
            "+" -> numList[0] + numList[1] == numList[2]
            "-" -> numList[0] - numList[1] == numList[2]
            "*" -> numList[0] * numList[1] == numList[2]
            "/" -> numList[0] / numList[1] == numList[2]
            else -> false
        }

        bw.appendLine(if (result) "correct" else "wrong answer")
        bw.flush()
    }

    bw.close()
}