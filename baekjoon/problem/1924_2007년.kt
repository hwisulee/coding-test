import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val monthArr = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val dayArr = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    val (month, day) = readLine().split(" ").map { it.toInt() }
    val currentDay = if (month > 1) {
        val days = monthArr.slice(0 until month - 1).sum()
        dayArr[(days + day) % 7]
    } else {
        dayArr[day % 7]
    }

    bw.write(currentDay)
    bw.flush()
    bw.close()
}