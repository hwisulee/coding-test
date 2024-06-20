import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().toBigInteger() + 1.toBigInteger()
    val list = input.toString().map { it.toString().toInt() }.toMutableList()

    for (i in 0 until 10000) {
        for (j in 0 .. list.size / 2) {
            if (list[j] < list[list.size - j - 1]) list[list.size - j - 2] += 1

            list[list.size - j - 1] = list[j]

            for (k in list.size - 1 downTo 0) {
                if (list[k] >= 10) {
                    list[k] %= 10

                    if (k > 0) list[k - 1] += 1 else list.add(0, 1)
                }
            }
        }
    }

    bw.write(list.joinToString(""))
    bw.flush()
    bw.close()
}