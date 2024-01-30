import java.io.BufferedWriter
import java.io.OutputStreamWriter

var arr = arrayOf<String>()

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()

    repeat(t) {
        if (it > 0) arr += ""
        isZero(1, readLine().toInt(), "1")
    }

    arr.forEach { bw.appendLine(it) }
    bw.flush()
    bw.close()
}

fun isZero(target: Int, n: Int, txt: String) {
    if (target == n) {
        val filteredNum = txt.replace(" ", "").split("[+\\-]".toRegex()).map { it.toInt() }.toMutableList()
        val filterdOperator = txt.replace(" ", "").split("[0-9]".toRegex()).filter { it.isNotEmpty() }

        for (i in filterdOperator.indices) {
            when (filterdOperator[i]) {
                "+" -> filteredNum[i + 1] = filteredNum[i] + filteredNum[i + 1]
                "-" -> filteredNum[i + 1] = filteredNum[i] - filteredNum[i + 1]
            }
        }
        if (filteredNum[filteredNum.lastIndex] == 0) arr += txt
        return
    }

    val next = target + 1
    isZero(target + 1, n, "$txt $next")
    isZero(target + 1, n, "$txt+$next")
    isZero(target + 1, n, "$txt-$next")
}