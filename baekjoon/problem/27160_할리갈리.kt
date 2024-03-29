import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = hashMapOf<String, Int>()
    repeat(n) {
        val (s, x) = readLine().split(" ")
        if (!list.containsKey(s)) list += Pair(s, x.toInt()) else list[s] = list[s]!! + x.toInt()
    }

    bw.write(if (list.count { it.value == 5 } > 0) "YES" else "NO")
    bw.flush()
    bw.close()
}