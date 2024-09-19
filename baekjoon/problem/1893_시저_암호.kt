import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val alphabet = readLine()
        val word = readLine()
        val cipher = readLine()

        val shiftMatches = mutableListOf<Int>()
        val indexMap = mutableMapOf<Char, Int>()
        for (i in alphabet.indices) indexMap[alphabet[i]] = i

        for (shift in alphabet.indices) {
            val decrypted = decrypt(shift, cipher, indexMap, alphabet)
            val cnt = kmpSearch(word, decrypted)

            if (cnt == 1) shiftMatches.add(shift)
        }

        val result = when (shiftMatches.size) {
            0 -> "no solution"
            1 -> "unique: ${shiftMatches[0]}"
            else -> "ambiguous: ${shiftMatches.joinToString(" ")}"
        }

        bw.write("$result\n")
    }
    bw.flush()
    bw.close()
}

fun decrypt(shift: Int, cipher: String, indexMap: MutableMap<Char, Int>, alphabet: String): String {
    val length = alphabet.length
    val sb = StringBuilder()

    for (c in cipher) {
        val idx = (indexMap[c]!! - shift + length) % length
        sb.append(alphabet[idx])
    }

    return sb.toString()
}

fun kmpSearch(pattern: String, text: String): Int {
    val m = pattern.length
    val n = text.length

    val lps = IntArray(m)
    var j = 0
    var i = 1

    while (i < m) {
        if (pattern[i] == pattern[j]) {
            j++
            lps[i] = j
            i++
        } else {
            if (j != 0) {
                j = lps[j - 1]
            } else {
                lps[i] = 0
                i++
            }
        }
    }

    var count = 0
    i = 0
    j = 0

    while (i < n) {
        if (pattern[j] == text[i]) i++.also { j++ }

        if (j == m) {
            count++
            j = lps[j - 1]
        } else if (i < n && pattern[j] != text[i]) {
            if (j != 0) j = lps[j - 1] else i++
        }
    }

    return count
}