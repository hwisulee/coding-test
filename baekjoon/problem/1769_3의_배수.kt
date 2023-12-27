import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    var num = readLine().map { it.code - 48 }

    while (num.size != 1) {
        cnt++
        num = num.sum().toString().map { it.code - 48 }
    }

    bw.write(if (num[0] % 3 == 0) "$cnt\nYES" else "$cnt\nNO")
    bw.flush()
    bw.close()
}