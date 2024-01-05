import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val alphabet = IntArray(26) { 0 }
    var max = 0
    while (true) {
        val input = readLine() ?: break
        input.forEach {
            if (it != ' ') {
                alphabet[it - 'a']++
                if (max < alphabet[it - 'a']) max = alphabet[it - 'a']
            }
        }
    }

    alphabet.forEachIndexed { index, i ->
        if (max == i) bw.write("${'a' + index}")
    }
    bw.flush()
    bw.close()
}