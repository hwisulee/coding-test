import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val name = readLine()
    val choice = MutableList<String>(n) { readLine() }

    var cnt = 0
    for (str in choice) {
        cnt += checkChoice(str, name)
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun checkChoice(str: String, name: String): Int {
    val nL = name.length

    for (i in str.indices) {
        if (str[i] == name[0]) {
            for (j in i + 1 until str.length) {
                if (str[j] == name[nL - 1]) {
                    val gap = (j - i) / (nL - 1)
                    if ((j - i) % (nL - 1) != 0) continue

                    var cnt = 1
                    while (cnt < nL) {
                        if (str[i + gap * cnt] == name[cnt]) {
                            cnt++
                        } else {
                            break
                        }
                    }

                    if (cnt == nL) return 1
                }
            }
        }
    }

    return 0
}