import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (lv, grade) = readLine().split(" ")
    val score = when (grade) {
        "bad" -> lv.toInt() * 200
        "cool" -> lv.toInt() * 400
        "great" -> lv.toInt() * 600
        "perfect" -> lv.toInt() * 1000
        else -> 0
    }
    
    bw.write("$score")
    bw.flush()
    bw.close()
}