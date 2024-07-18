import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        var answer = -1
        val (a, b) = readLine().split(" ")

        answer += checkMovementNum(a, b)
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()
}

fun checkMovementNum(a: String, b: String): Int {
    if (a.length != b.length) return 0

    var cnt = 1
    val aPos = mutableListOf<Int>()
    val bPos = mutableListOf<Int>()

    for (i in a.indices) {
        if (a[i] == 'a') aPos.add(i)
        if (b[i] == 'a') bPos.add(i)
    }

    if (aPos.size != bPos.size) return 0

    for (i in aPos.indices) {
        cnt += abs(aPos[i] - bPos[i])
    }

    return cnt
}