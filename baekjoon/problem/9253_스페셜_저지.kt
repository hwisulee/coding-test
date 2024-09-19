
import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

lateinit var rank: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine()
    val input = readLine()
    
    val ab = "$a#$b"
    val suffixArr = getSuffixArray(ab, ab.length)
    val lcpArr = getLCPArray(ab, suffixArr, ab.length)

    var maxL = 0
    var maxIdx = 0
    for (i in 1 until ab.length) {
        if ((suffixArr[i - 1]!! < a.length && suffixArr[i]!! > a.length) || (suffixArr[i - 1]!! > a.length && suffixArr[i]!! < a.length)) {
            if (lcpArr[i] > maxL) {
                maxL = lcpArr[i]
                maxIdx = suffixArr[i]!!
            }
        }
    }

    val result = ab.substring(maxIdx, maxIdx + maxL)

    bw.write(if (result == input) "YES" else "NO")
    bw.flush()
    bw.close()
}

fun getSuffixArray(input: String, abLength: Int): Array<Int?> {
    val suffixArray = arrayOfNulls<Int>(abLength)
    rank = IntArray(abLength)
    for (i in 0 until abLength) {
        suffixArray[i] = i
        rank[i] = input[i] - 'a'
    }

    var length = 1
    while (length < abLength) {
        val l = length
        Arrays.sort<Int?>(suffixArray) { i: Int?, j: Int? ->
            if (rank[i!!] != rank[j!!]) {
                return@sort rank[i].compareTo(rank[j])
            }
            val rankI = if ((i + l < abLength)) rank[i + l] else -1
            val rankJ = if ((j + l < abLength)) rank[j + l] else -1
            rankI.compareTo(rankJ)
        }

        val tempRank = IntArray(abLength)
        tempRank[suffixArray[0]!!] = 0
        for (i in 1 until abLength) {
            tempRank[suffixArray[i]!!] = tempRank[suffixArray[i - 1]!!]
            if (rank[suffixArray[i]!!] != rank[suffixArray[i - 1]!!] ||
                (if (suffixArray[i]!! + l < abLength) rank[suffixArray[i]!! + l] else -1) !=
                (if (suffixArray[i - 1]!! + l < abLength) rank[suffixArray[i - 1]!! + l] else -1)
            ) {
                tempRank[suffixArray[i]!!]++
            }
        }
        rank = tempRank
        length *= 2
    }

    return suffixArray
}

fun getLCPArray(input: String, sa: Array<Int?>, sbLength: Int): IntArray {
    val lcp = IntArray(sbLength)
    var h = 0
    for (i in 0 until sbLength) {
        if (rank[i] > 0) {
            val j: Int = sa[rank[i] - 1]!!
            while (i + h < sbLength && j + h < sbLength && input[i + h] == input[j + h]) {
                h++
            }
            lcp[rank[i]] = h
            if (h > 0) h--
        }
    }

    return lcp
}
