import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    bw.write(getSuffixArray(str).joinToString("\n"))
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