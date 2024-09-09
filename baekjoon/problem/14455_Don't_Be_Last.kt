import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<String, Int>()
    repeat(readLine().toInt()) {
        val (cow, cnt) = readLine().split(" ")
        when {
            map.containsKey(cow) -> map[cow] = map[cow]!! + cnt.toInt()
            else -> map[cow] = cnt.toInt()
        }
    }

    val targetIndex = if (map.size == 7 && map.values.groupBy { it }.size != 1) 1 else 0

    map.asSequence().groupBy { it.value }.toList()
        .sortedBy { it.first }
        .withIndex()
        .firstOrNull { it.index == targetIndex }
        ?.let {
            val cur = it.value.second
            bw.write(if (cur.size >= 2) "Tie" else cur[0].key)
        }

    bw.flush()
    bw.close()
}