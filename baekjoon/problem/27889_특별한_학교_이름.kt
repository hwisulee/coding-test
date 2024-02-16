import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(
        when (readLine()) {
            "NLCS" -> "North London Collegiate School"
            "BHA" -> "Branksome Hall Asia"
            "KIS" -> "Korea International School"
            "SJA" -> "St. Johnsbury Academy"
            else -> "Error"
        }
    )
    bw.flush()
    bw.close()
}