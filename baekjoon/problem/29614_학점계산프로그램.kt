import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().
    replace("A+", "0").
    replace("A", "1").
    replace("B+", "2").
    replace("B", "3").
    replace("C+", "4").
    replace("C", "5").
    replace("D+", "6").
    replace("D", "7").
    replace("F", "8")

    val converted = input.chunked(1).map { convertGrade(it) }
    
    bw.write(String.format("%.5f", converted.sum() / converted.size))
    bw.flush()
    bw.close()
}

fun convertGrade(grade: String): Double {
    return when (grade) {
        "0" -> 4.5
        "1" -> 4.0
        "2" -> 3.5
        "3" -> 3.0
        "4" -> 2.5
        "5" -> 2.0
        "6" -> 1.5
        "7" -> 1.0
        else -> 0.0
    }
}