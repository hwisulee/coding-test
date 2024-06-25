import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    val map = Array(10) { readLine().split(" ") }

    // row
    for (i in map.indices) {
        if (map[i].groupingBy { it }.eachCount().size == 1) {
            cnt = 1
            break
        }
    }

    if (cnt == 0) {
        // column
        for (i in map[0].indices) {
            val temp = mutableListOf<String>()
            for (j in map.indices) {
                temp += map[j][i]
            }

            if (temp.groupingBy { it }.eachCount().size == 1) {
                cnt = 1
                break
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}