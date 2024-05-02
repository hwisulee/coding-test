import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = readLine().toInt()
    val n = readLine().toInt()

    val before = StringBuilder()
    repeat(k) {
        before.append('A' + it)
    }
    val after = StringBuilder(readLine())

    // start - ? - end
    var unknownIdx = -1
    val ladder = Array<String>(n) {
        readLine().apply { if (contains("?")) unknownIdx = it }
    }

    // start -> ?
    for (i in 0 until unknownIdx) {
        for (j in 0 until k - 1) {
            if (ladder[i][j] == '-') swap(j, before)
        }
    }

    // end -> ?
    for (i in n - 1 downTo unknownIdx) {
        for (j in 0 until k - 1) {
            if (ladder[i][j] == '-') swap(j, after)
        }
    }

    val result = StringBuilder()
    for (i in 0 until k - 1) {
        if (before[i] != after[i]) {
            swap(i, before)
            result.append('-')
        } else {
            result.append('*')
        }
    }

    bw.write(if (before.toString() == after.toString()) "$result" else "x".repeat(k - 1))
    bw.flush()
    bw.close()
}

fun swap(idx: Int, sb: StringBuilder) {
    sb[idx] = sb[idx + 1].also { sb[idx + 1] = sb[idx] }
}