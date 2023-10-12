import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val stack = Stack<Pair<Int, Int>>()
    val dp = IntArray(n) { 0 }
    var max = 0
    repeat(n) {
        val num = st.nextToken().toInt()

        if (max < num) {
            stack.clear()
            stack.add(Pair(num, it + 1))
            max = num
        } else {
            while (true) {
                if (stack.last().first < num) stack.removeLast()
                else {
                    dp[it] = stack.last().second
                    stack.add(Pair(num, it + 1))
                    break
                }
            }
        }
    }

    bw.write(dp.joinToString(" "))
    bw.flush()
    bw.close()
}