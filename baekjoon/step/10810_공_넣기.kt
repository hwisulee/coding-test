import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val intarray = IntArray(n) { 0 }

    for (a in 1 .. m) {
        val (i, j, k) = br.readLine().split(" ").map { it.toInt() }
        val intrange = (i..j)

        for (b in intarray.indices) {
            if (intrange.contains(b + 1)) {
                if (intarray[b] != k) {
                    intarray[b] = k
                }
            }
        }
    }

    bw.write(intarray.joinToString(" "))
    bw.flush()
    bw.close()
}