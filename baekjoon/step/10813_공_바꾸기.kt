import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val intarray = IntArray(n) { 0 }

    for (i in intarray.indices) {
        intarray[i] = i + 1
    }

    for (a in 1 .. m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() - 1 }

        val temp = intarray[j]
        intarray[j] = intarray[i]
        intarray[i] = temp
    }

    bw.write(intarray.joinToString(" "))
    bw.flush()
    bw.close()
}