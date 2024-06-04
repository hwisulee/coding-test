import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    for (i in 0 until 3) {
        val cur = readLine()

        try {
            val temp = cur.toInt()
            result = when (i) {
                0 -> temp + 3
                1 -> temp + 2
                2 -> temp + 1
                else -> -1
            }
            break
        } catch (_: NumberFormatException) {
            continue
        }
    }

    bw.write(
        when {
            result % 15 == 0 -> "FizzBuzz"
            result % 5 == 0 -> "Buzz"
            result % 3 == 0 -> "Fizz"
            else -> "$result"
        }
    )
    bw.flush()
    bw.close()
}