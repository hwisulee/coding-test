import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

val fail = IntArray(10000)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val programs = MutableList(n) {
        val m = readLine().toInt()
        readLine().split(" ").map { it.toInt() }
    }

    for (i in 0 .. programs[0].size - k) {
        val cur = programs[0].subList(i, i + k)
        var flag = true

        for (j in 1 until n) {
            val check = BooleanArray(2)

            if (kmp(programs[j], cur)) {
                check[0] = true
            }
            if (kmp(programs[j].reversed(), cur)) {
                check[1] = true
            }

            flag = flag && (check[0] || check[1])
        }

        if (flag) {
            bw.apply { append("YES").flush() }
            exitProcess(0)
        }
    }

    bw.write("NO")
    bw.flush()
    bw.close()
}

fun kmp(parent: List<Int>, pattern: List<Int>): Boolean {
    val parentSize = parent.size
    val patternSize = pattern.size

    var i = 0
    for (j in 1 until patternSize) {
        while (i > 0 && pattern[i] != pattern[j]) i = fail[i - 1]
        if (pattern[i] == pattern[j]) fail[j] = ++i
    }

    i = 0
    for (j in 0 until parentSize) {
        while (i > 0 && pattern[i] != parent[j]) i = fail[i - 1]
        if (pattern[i] == parent[j]) {
            if (i == patternSize - 1) return true else i++
        }
    }

    return false
}