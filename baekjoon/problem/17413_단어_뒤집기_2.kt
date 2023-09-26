import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s = readLine()
    var index = 0
    var length = s.length
    var findIndex = 0
    val arr = mutableListOf<String>()
    while (index < length) {
        if (s[0] == '<') {
            findIndex = s.indexOf('>') + 1
            arr += s.substring(0, findIndex)
            s = s.substring(findIndex)
            length = s.length
        } else {
            findIndex = s.indexOfFirst { it == '<' }

            if (findIndex == -1) {
                index = length
                s.split(" ").also {
                    it.forEachIndexed { index, s -> arr += if (index != it.lastIndex) s.reversed() + " " else s.reversed() }
                }
            } else {
                s.substring(0, findIndex).split(" ").also {
                    it.forEachIndexed { index, s -> arr += if (index != it.lastIndex) s.reversed() + " " else s.reversed() }
                }
                s = s.substring(findIndex)
                length = s.length
                index = 0
            }
        }
    }

    bw.write(arr.joinToString(""))
    bw.flush()
    bw.close()
}