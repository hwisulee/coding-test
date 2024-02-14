import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.Duration
import java.time.LocalDateTime
import kotlin.math.absoluteValue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val startTime = readLine()
    val endTime = readLine()
    val stSplit = startTime.split(":").map { it.toInt() }
    val etSplit = endTime.split(":").map { it.toInt() }

    val later: LocalDateTime
    val earlier: LocalDateTime
    if (startTime < endTime) {
        later = stSplit.let { LocalDateTime.of(2000, 1, 1, it[0], it[1], it[2]) }
        earlier = etSplit.let { LocalDateTime.of(2000, 1, 1, it[0], it[1], it[2]) }
    } else {
        later = etSplit.let { LocalDateTime.of(2000, 1, 2, it[0], it[1], it[2]) }
        earlier = stSplit.let { LocalDateTime.of(2000, 1, 1, it[0], it[1], it[2]) }
    }

    val duration = Duration.between(later, earlier).seconds.absoluteValue
    bw.write("%02d:%02d:%02d".format(duration / 3600, (duration % 3600) / 60, duration % 60))
    bw.flush()
    bw.close()
}