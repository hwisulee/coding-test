import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val mod = intArrayOf(100000000 + 7, 1000000000 + 9)
val longs1 = LongArray(2)
val longs2 = LongArray(2)
val set = HashSet<Long>()
val base = 31

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine()
    
    val arr = IntArray(3) { 0 }.also { it[1] = n }
    while (arr[0] <= arr[1]) {
        val mid = (arr[0] + arr[1]) shr 1
        if (rabinKarp(mid, str, n)) {
            arr[2] = mid
            arr[0] = mid + 1
        } else {
            arr[1] = mid - 1
        }
    }

    bw.write("${arr[2]}")
    bw.flush()
    bw.close()
}

fun rabinKarp(m: Int, str: String, n: Int): Boolean {
    set.clear()
    for (i in 0..1) {
        longs1[i] = 1L
        longs2[i] = str[0].code.toLong()
    }
    for (i in 1 until m) {
        for (j in 0..1) {
            longs2[j] = (longs2[j] * base + str[i].code.toLong()) % mod[j]
            longs1[j] = (longs1[j] * base) % mod[j]
        }
    }
    set.add((longs2[0] shl 32) or longs2[1])
    for (i in m until n) {
        for (j in 0..1) {
            longs2[j] = ((longs2[j] - (str[i - m].code.toLong() * longs1[j]) % mod[j] + mod[j]) % mod[j])
            longs2[j] = (longs2[j] * base + str[i].code.toLong()) % mod[j]
        }
        val key = (longs2[0] shl 32) or longs2[1]
        if (!set.contains(key)) set.add(key) else return true
    }

    return false
}