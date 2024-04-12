import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val (name, score) = readLine().split(" ")
        bw.write("$name ${getGrade(score.toInt())}")
        if (it < n) bw.append("\n")
    }
    bw.flush()
    bw.close()
}

fun getGrade(score: Int): String {
    return when (score) {
        in 97 .. 100 -> "A+"
        in 90 .. 96 -> "A"
        in 87 .. 89 -> "B+"
        in 80 .. 86 -> "B"
        in 77 .. 79 -> "C+"
        in 70 .. 76 -> "C"
        in 67 .. 69 -> "D+"
        in 60 .. 66 -> "D"
        else -> "F"
    }
}