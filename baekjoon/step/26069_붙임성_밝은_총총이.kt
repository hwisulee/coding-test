import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = HashSet<String>()

    repeat(n) {
        val (a, b) = br.readLine().split(" ")

        if (a == "ChongChong" || b == "ChongChong") {
            arr.add(a)
            arr.add(b)
        }
        if (arr.contains(a)) arr.add(b)
        if (arr.contains(b)) arr.add(a)
    }

    bw.write("${arr.size}")
    bw.flush()
    bw.close()
}