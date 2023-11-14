import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val hashMap = HashMap<Long, Long>()
    repeat(n) {
        val card = readLine().toLong()
        if (!hashMap.containsKey(card)) {
            hashMap[card] = 1
        } else {
            hashMap[card] = hashMap[card]!! + 1
        }
    }

    bw.write("${hashMap.toList().sortedWith(compareByDescending<Pair<Long, Long>> { it.second }.thenBy { it.first })[0].first}")
    bw.flush()
    bw.close()
}