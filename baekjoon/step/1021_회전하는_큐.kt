import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (n, m) = br.readLine().split(" ").map { it.toInt() }
    val num = br.readLine().split(" ").map { it.toInt() }
    val dq = ArrayDeque<Int>(n)
    repeat(n) {
        dq.add(it + 1)
    }

    var min = 0
    var cnt = 0
    for (i in num) {
        if (dq.indexOf(i) >= n - dq.indexOf(i)) {
             min = n - dq.indexOf(i)
            
            for (j in 0 until min) {
                dq.addFirst(dq.removeLast())
            }
        } else {
            min = dq.indexOf(i)
            for (j in 0 until min) {
                dq.addLast(dq.removeFirst())
            }
        }
        dq.removeFirst()
        n -= 1
        cnt += min
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}