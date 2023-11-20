import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val arr = IntArray(26) { 0 }
    str.forEach { arr[it - 'A']++ }

    var oddCnt = 0
    arr.forEach {
        if (it != 0) {
            if (it % 2 != 0) oddCnt++
        }
    }

    var answer = ""
    val sb = StringBuilder()
    if (oddCnt > 1) bw.write("I'm Sorry Hansoo")
    else {
        repeat(arr.size) { for (i in 0 until arr[it] / 2) { sb.append("${(it + 65).toChar()}") } }
        answer += sb.toString()
        val temp = sb.reverse().toString()

        sb.clear()
        repeat(arr.size) { if (arr[it] % 2 == 1) sb.append("${(it + 65).toChar()}") }
        answer += sb.toString() + temp
    }

    bw.write(answer)
    bw.flush()
    bw.close()
}