import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val now = emptyArray<String>().toHashSet()

    repeat(n) {
        val employee = br.readLine().split(" ")

        if (employee[1] == "enter") now.add(employee[0])
        if (employee[1] == "leave") now.remove(employee[0])
    }

    bw.write(now.sortedDescending().joinToString("\n"))
    bw.flush()
    bw.close()
}