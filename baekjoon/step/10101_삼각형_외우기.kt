import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = emptyArray<Int>()
    repeat(3) {
        val input = br.readLine().toInt()
        arr += input
    }

    when {
        arr.filter { it == 60 }.size == 3 -> bw.write("Equilateral")
        arr.sum() == 180 -> {
            if (arr.groupBy { it }.size == 2) bw.write("Isosceles")
            if (arr.groupBy { it }.size == 3) bw.write("Scalene")
        }
        else -> bw.write("Error")
    }

    bw.flush()
    bw.close()
}