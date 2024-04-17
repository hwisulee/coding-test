import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()

        val hashMap = hashMapOf<String, Int>()
        readLine().split(" ").forEachIndexed { index, s ->
            hashMap[s] = index
        }

        val plainText = IntArray(n)
        readLine().split(" ").forEachIndexed { index, s ->
            plainText[index] = hashMap[s]!!
        }

        val code = readLine().split(" ")
        val decodeText = Array(n) { "" }
        for (i in 0 until n) {
            decodeText[plainText[i]] = code[i]
        }

        bw.appendLine(decodeText.joinToString(" "))
        bw.flush()
    }

    bw.close()
}