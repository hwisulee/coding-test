import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    while (true) {
        val input = br.readLine().split(" ").map { it.toInt() }.sorted()

        if (input.sum() == 0) break
        if (input[2] >= input[0] + input[1]) bw.appendLine("Invalid")
        else {
            when (input.groupBy { it }.size) {
                1 -> bw.appendLine("Equilateral")
                2 -> bw.appendLine("Isosceles")
                3 -> bw.appendLine("Scalene")
            }
        }
    }

    bw.flush()
    bw.close()
}