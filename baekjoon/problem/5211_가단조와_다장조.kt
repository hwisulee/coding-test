import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val count = IntArray(2)
    val input = readLine().split("|")
    for (i in input.indices) {
        when (input[i][0]) {
            'A', 'D', 'E' -> count[0]++
            'C', 'F', 'G' -> count[1]++
        }
    }
    
    val last = input.last().last()
    if (count[0] == count[1]) {
        when (last) {
            'A', 'D', 'E' -> count[0]++
            'C', 'F', 'G' -> count[1]++
        }
    }

    bw.write(if (count[0] > count[1]) "A-minor" else "C-major")
    bw.flush()
    bw.close()
}