import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = hashMapOf<String, Int>()
    repeat(n) {
        val str = br.readLine()
        if (str.length < m) return@repeat
        if (map.contains(str)) map[str] = map[str]!! + 1
        else map[str] = 0
    }

    val answer = map.entries.sortedWith(Comparator { o1, o2 ->
        when {
            o1.value != o2.value -> {
                o2.value.compareTo(o1.value)
            }
            o1.key.length != o2.key.length -> {
                o2.key.length - o1.key.length
            }
            else -> {
                o1.key.compareTo(o2.key)
            }
        }
    })

    answer.forEach { bw.appendLine(it.key) }
    bw.flush()
    bw.close()
}