import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = IntArray(4)
    val regex = "(w+o+l+f+)+".toRegex()
    var check = false

    val input = readLine()
    for (i in input.indices) {
        val cur = input[i]
        when (cur) {
            'w' -> count[0]++
            'o' -> count[1]++
            'l' -> count[2]++
            else -> count[3]++
        }

        if (i < input.lastIndex && cur == 'f' && input[i + 1] == 'w') {
            if (count.toList().groupingBy { it }.eachCount().size != 1) {
                check = true
                break
            }
        }
    }

    bw.write(if (!check && input.matches(regex) && count.toList().groupingBy { it }.eachCount().size == 1) "1" else "0")
    bw.flush()
    bw.close()
}