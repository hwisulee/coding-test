import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s1 = readLine()
    val s2 = readLine()
    val s3 = readLine()
    val arr: Array<Array<IntArray>> = Array(s1.length + 1) { Array(s2.length + 1) { IntArray(s3.length + 1) { 0 } } }
    for (i in 1 until s1.length + 1) {
        for (j in 1 until s2.length + 1) {
            for (k in 1 until s3.length + 1) {
                if (s1[i - 1] == s2[j - 1] && s2[j - 1] == s3[k - 1])arr[i][j][k] = arr[i - 1][j - 1][k - 1] + 1
                else arr[i][j][k] = arr[i - 1][j][k].coerceAtLeast(arr[i][j - 1][k].coerceAtLeast(arr[i][j][k - 1]))
            }
        }
    }

    bw.write("${arr[s1.length][s2.length][s3.length]}")
    bw.flush()
    bw.close()
}