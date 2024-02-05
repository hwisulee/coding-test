import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cnt = IntArray(2) { 0 }
    val emoticon = readLine().replace("[a-z|A-Z]".toRegex(), "").filter { !it.isWhitespace() }.chunked(3)
    cnt[0] = emoticon.count { it == ":-)" }
    cnt[1] = emoticon.count { it == ":-(" }
    
    bw.write(if (cnt.sum() == 0) "none" else { if (cnt[0] == cnt[1]) "unsure" else if (cnt[0] > cnt[1]) "happy" else "sad" })
    bw.flush()
    bw.close()
}