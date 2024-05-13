import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (x1 ,y1, r1, x2, y2, r2) = readLine().split(" ").map { it.toDouble() }
        val distance = sqrt((x1 - x2).pow(2) + (y1 - y2).pow(2))
        val result = when {
            distance == 0.0 && r1 == r2 -> -1
            distance > r1 + r2 || distance < abs(r1 - r2) || (distance == 0.0 && r1 != r2) -> 0
            distance == r1 + r2 || distance == abs(r1 - r2) -> 1
            distance < r1 + r2 || distance > abs(r1 - r2) -> 2
            else -> 999
        }

        bw.appendLine("$result")
    }
    bw.flush()
    bw.close()
}

private operator fun <E> List<E>.component6(): E = get(5)