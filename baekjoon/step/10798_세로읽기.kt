import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(5) { Array(15) { "-" } }

    for (i in arr.indices) {
        val answer = br.readLine().chunked(1)

        for (j in answer.indices) {
            arr[i][j] = answer[j]
        }
    }

    val max = arr.indices.maxOfOrNull { i -> arr[i].size }!!

    for (i in 0 until max) {
        for (j in arr.indices) {
            if (arr[j][i] == "-") continue

            bw.write(arr[j][i])
        }
    }

    bw.flush()
    bw.close()
}