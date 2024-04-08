import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val set = mutableSetOf<Char>()
    repeat(n) {
        var isFirstChar = false

        readLine().also { option ->
            val words = option.split(" ").toMutableList()
            for (i in words.indices) {
                val cur = words[i]
                if (!set.contains(cur[0].lowercaseChar())) {
                    set.add(cur[0].lowercaseChar())
                    words[i] = words[i].replaceRange(0 .. 0, "[${cur[0]}]")
                    isFirstChar = true
                    break
                }
            }

            var isChanged = false
            if (!isFirstChar) {
                for (i in words.indices) {
                    if (!isChanged) {
                        for (j in words[i].indices) {
                            val cur = words[i][j]
                            if (j != 0 && !set.contains(cur.lowercaseChar())) {
                                set.add(cur.lowercaseChar())
                                words[i] = words[i].replaceRange(j .. j, "[$cur]")
                                isChanged = true
                                break
                            }
                        }
                    }
                }
            }

            bw.write(if (it < n) "${words.joinToString(" ")}\n" else words.joinToString(" "))
            bw.flush()
        }
    }

    bw.close()
}