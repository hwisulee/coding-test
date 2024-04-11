import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val size = 360000
    val n = readLine().toInt()
    val c1 = IntArray(size * 2)
    val c2 = IntArray(size)
    repeat(2) {
        val input = readLine().split(" ").map { it.toInt() }
        for (i in 0 until n) {
            when (it) {
                0 -> {
                    c1[input[i]] = 1
                    c1[size + input[i]] = 1
                }

                1 -> c2[input[i]] = 1
            }
        }
    }

    bw.write(kmp(c1, c2, size))
    bw.flush()
    bw.close()
}

fun kmp(c1: IntArray, c2: IntArray, size: Int): String {
    var index = 0
    val table = makeTable(c2, size)

    for (i in 0 until size * 2) {
        while (index > 0 && c1[i] != c2[index]) index = table[index - 1]
        if (c1[i] == c2[index]) {
            if (index == size - 1) {
                return "possible"
            } else {
                index++
            }
        }
    }

    return "impossible"
}

fun makeTable(c: IntArray, size: Int): IntArray {
    var index = 0
    val table = IntArray(size)

    for (i in 1 until size) {
        while (index > 0 && c[i] != c[index]) index = table[index - 1]
        if (c[i] == c[index]) table[i] = ++index
    }

    return table
}