import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    if (arr[2] < arr[0] + arr[1]) {
        bw.write("${arr.sum()}")
    } else {
        bw.write("${(arr[0] + arr[1]) * 2 - 1}")
    }

    bw.flush()
    bw.close()
}