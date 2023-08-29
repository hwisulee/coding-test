import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dic = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val cnt = IntArray(26) { 0 }
    br.readLine().forEach { c -> for (i in dic.indices) { if (c == dic[i]) { cnt[i]++; break; } } }

    bw.write(cnt.joinToString(" "))
    bw.flush()
    bw.close()
}