
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val suffixArray = getSuffixArray(input)
    val lcsArray = getLCPArray(input, suffixArray)

    for (i in suffixArray.indices) {
        suffixArray[i] += 1
    }

    bw.appendLine(suffixArray.joinToString(" "))
    bw.write("x ${lcsArray.joinToString(" ")}")
    bw.flush()
    bw.close()
}

fun getSuffixArray(input: String): ArrayList<Int> {
    val n = input.length
    var t = 1
    val perm = ArrayList<Int>()
    var group = IntArray(n + 1)

    for (i in 0 until n) {
        perm += i
        group[i] = input[i] - 'a'
    }

    group[n] = -1

    val compareUsing2T = CompareUsing2T(n, t, group)
    while (t < n) {
        Collections.sort(perm, compareUsing2T.comparator())
        t *= 2
        if (t >= n) break

        val newGroup = IntArray(n + 1).also {
            it[perm[0]] = 0
            it[n] = -1
        }

        for (i in 1 until n) {
            if (compareUsing2T.comparator().compare(perm[i - 1], perm[i]) < 0) newGroup[perm[i]] = newGroup[perm[i - 1]] + 1
            else newGroup[perm[i]] = newGroup[perm[i - 1]]
        }

        group = newGroup
        compareUsing2T.changeValues(t, group)
    }

    return perm
}

fun getLCPArray(input: String, sa: ArrayList<Int>): IntArray {
    val n = sa.size
    val lcp = IntArray(n - 1)
    val isa = IntArray(n)

    for (i in 0 until n) {
        isa[sa[i]] = i
    }

    var k = 0
    for (i in 0 until n) {
        val idx = isa[i]
        if (idx == n - 1) continue

        val j = sa[idx + 1]
        while (i + k < n && j + k < n) {
            if (input[i + k] != input[j + k]) break
            k++
        }

        lcp[idx] = k
        if (k > 0) k--
    }

    return lcp
}

class CompareUsing2T(private val n: Int, private var t: Int, private var group: IntArray) {
    fun changeValues(t: Int, group: IntArray) {
        this.t = t
        this.group = group.copyOf(group.size)
    }

    fun comparator() = Comparator<Int> { o1, o2 ->
        if (group[o1] != group[o2]) return@Comparator group[o1] - group[o2]

        var left = o1 + t
        var right = o2 + t

        if (o1 + t > n) left = n
        if (o2 + t > n) right = n

        group[left] - group[right]
    }
}