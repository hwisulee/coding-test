import java.io.*

var re_cnt = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        br.readLine().also {
            bw.appendLine("${isPalindrome(it)} $re_cnt")
            re_cnt = 0
        }
    }
    bw.flush()
    bw.close()
}

fun recursion(s: String, l: Int, r: Int): Int {
    re_cnt += 1

    return if (l >= r) 1
    else if (s[l] != s[r]) 0
    else recursion(s, l + 1, r - 1)
}

fun isPalindrome(s: String): Int {
    return recursion(s, 0, s.length - 1)
}