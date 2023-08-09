import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val hash = HashSet<Int>()
    repeat(br.readLine().toInt()) {
        val request = br.readLine().also {
            if (it == "all" || it == "empty") {
                hash.clear()
                if (it == "all") (1..20).forEach { i -> hash.add(i) }
            } else {
                val (type, num) = it.split(" ")

                when (type) {
                    "add" -> hash.add(num.toInt())
                    "remove" -> hash.remove(num.toInt())
                    "check" -> if (hash.contains(num.toInt())) bw.appendLine("1") else bw.appendLine("0")
                    "toggle" -> if (hash.contains(num.toInt())) hash.remove(num.toInt()) else hash.add(num.toInt())
                }
            }
        }
    }
    bw.flush()
    bw.close()
}