import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(9) { IntArray(9) }

    for (i in arr.indices) {
        val answer = br.readLine().split(" ").map { it.toInt() }

        for (j in arr[i].indices) {
            arr[i][j] = answer[j]
        }
    }

    var switch = false
    val max = arr.indices.maxOfOrNull { i -> arr[i].max() }
    arr.indices.map { i -> arr[i].indices.map { j -> if (arr[i][j] == max && !switch) { bw.write("$max\n${i + 1} ${j + 1}"); switch = true } } }

    bw.flush()
    bw.close()
}