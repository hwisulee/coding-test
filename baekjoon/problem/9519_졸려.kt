import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val x = readLine().toInt()
    val input = readLine()
    val backIndex = input.lastIndex - if (input.length % 2 == 1) 1 else 0
    val word = mutableSetOf<String>().apply { add(input) }

    while (true) {
        val cur = word.last()
        val sb = StringBuilder()

        for (i in cur.indices step 2) sb.append(cur[i])
        for (i in backIndex downTo 0 step 2) sb.append(cur[i])
        if (!word.add(sb.toString())) break
    }

    bw.write(word.toList()[x % word.size])
    bw.flush()
    bw.close()
}