import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val students = (1..30).map { it }.toMutableSet()
    val submitList = IntArray(28) { br.readLine().toInt() }.toMutableSet()
    val aa = students.subtract(submitList)

    bw.write(aa.joinToString("\n"))
    bw.flush()
    bw.close()
}