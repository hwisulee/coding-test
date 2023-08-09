import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val case = br.readLine().toInt()
    repeat(case) {
        val num = br.readLine().toInt()
        val arr = HashMap<String, Int>()

        for (i in 0 until num) {
            val temp = br.readLine().split(" ")[1]
            if (arr.containsKey(temp)) arr[temp] = 1 + arr[temp]!!
            else arr[temp] = 1
        }

        var answer = 1
        for (i in arr.values) answer *= (i + 1)
        bw.appendLine("${answer - 1}")
    }
    bw.flush()
    bw.close()
}