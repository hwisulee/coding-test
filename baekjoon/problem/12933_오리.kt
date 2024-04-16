import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toCharArray()
    val check = BooleanArray(input.size)
    val duck = arrayOf('q', 'u', 'a', 'c', 'k')

    if (input[0] != 'q' || input.size % 5 != 0) wrongToExit(bw)

    val cnt = IntArray(2)
    for (i in input.indices) {
        val list = arrayListOf<Char>()
        for (j in i until input.size) {
            if (!check[j] && input[j] == duck[cnt[0]]) {
                cnt[0]++
                list.add(input[j])
                check[j] = true

                if (cnt[0] == 5) cnt[0] = 0
            }
        }

        if (list.size != 0) {
            if (list[list.lastIndex] != 'k') wrongToExit(bw) else cnt[1]++
        }
    }

    bw.write("${cnt[1]}")
    bw.flush()
    bw.close()
}

fun wrongToExit(bw: BufferedWriter) {
    bw.write("-1")
    bw.flush()
    bw.close()
    exitProcess(0)
}