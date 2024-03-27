import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val k = readLine().toInt()
        var check = true
        val arr = Array(k) { readLine() }
        for (i in 0 until k - 1) {
            if (check) {
                for (j in i + 1 until k) {
                    if (i == j) break
                    if (isPalindrome(arr[i], arr[j])) {
                        bw.appendLine(arr[i] + arr[j])
                        check = false
                        break
                    }
                    if (isPalindrome(arr[j], arr[i])) {
                        bw.appendLine(arr[j] + arr[i])
                        check = false
                        break
                    }
                }
            }
        }

        if (check) bw.appendLine("0")
        bw.flush()
    }
    
    bw.close()
}

fun isPalindrome(a: String, b: String): Boolean {
    val temp = a + b
    var isPalindrome = true
    for (i in 0 until temp.length / 2) {
        if (temp[i] != temp[temp.length - 1 - i]) {
            isPalindrome = false
            break
        }
    }

    return isPalindrome
}