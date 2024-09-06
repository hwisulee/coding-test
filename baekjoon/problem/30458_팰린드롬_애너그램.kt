import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    val cnt = IntArray(26)
    for (i in s.indices) {
        cnt[s[i] - 'a']++
    }
    
    if (n % 2 == 1) {
        cnt[s[n / 2] - 'a']--
    }
    
    for (i in 0 until 26) {
        if (cnt[i] % 2 == 1) {
            bw.write("No")
            bw.flush()
            exitProcess(0)
        }
    }
    
    bw.write("Yes")
    bw.flush()
    bw.close()
}