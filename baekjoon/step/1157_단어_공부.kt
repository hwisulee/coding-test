import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val wordGroup = br.readLine().chunked(1).groupBy { it.uppercase() }
    val max = wordGroup.maxOf { it.value.size }

    bw.write(if (wordGroup.filter { it.value.size >= max }.size >= 2) "?" else wordGroup.filter { it.value.size >= max }.values.flatten()[0].uppercase())
    bw.flush()
    bw.close()
}