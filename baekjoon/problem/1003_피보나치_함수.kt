import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val case = br.readLine().toInt()
    var temp = 0

    val arr = arrayListOf<Pair<Int, Int>>()
    arr.add(1 to 0)
    arr.add(0 to 1)

    for (i in 2 .. 40) arr.add(arr[i - 1].first + arr[i - 2].first to arr[i - 1].second + arr[i - 2].second)
    for (i in 0 until case) {
        temp = br.readLine().toInt()
        bw.appendLine("${arr[temp].first} ${arr[temp].second}")
    }
    bw.flush()
    bw.close()
}