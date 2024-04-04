import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val table = arrayOf(
        charArrayOf('A', 'C', 'A', 'G'),
        charArrayOf('C', 'G', 'T', 'A'),
        charArrayOf('A', 'T', 'C', 'G'),
        charArrayOf('G', 'A', 'G', 'T')
    )

    val n = readLine().toInt()
    val str = readLine()
    if (n != 1) {
        var cur = table[index(str[n - 1])][index(str[n - 2])]
        for (i in str.length - 3 downTo 0) {
            cur = table[index(cur)][index(str[i])]
        }

        bw.write("$cur")
        bw.flush()
    } else {
        bw.write(str)
        bw.flush()
    }
    
    bw.close()
}

fun index(c: Char): Int {
    return when(c) {
        'A' -> 0
        'G' -> 1
        'C' -> 2
        else -> 3
    }
}