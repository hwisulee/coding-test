import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var result = 0
    val negative = mutableListOf<Int>()
    val positive = mutableListOf<Int>()
    var zero = false
    repeat(n) {
        val num = readLine().toInt()
        when {
            num == 0 -> zero = true
            num == 1 -> result++
            num > 1 -> positive += num
            else -> negative += num
        }
    }

    positive.sort()
    negative.sortDescending()
    result += sequence(positive, positive.size) + sequence(negative, negative.size)

    bw.write("${if (negative.size % 2 != 0 && zero) result - negative[0] else result}")
    bw.flush()
    bw.close()
}

fun sequence(sequence: MutableList<Int>, size: Int): Int {
    return when {
        size == 0 -> 0
        size == 1 -> sequence[0]
        size % 2 == 0 -> sequence.chunked(2).map { it[0] * it[1] }.reduce { acc, i -> acc + i }
        else -> sequence[0] + sequence.subList(1, size).chunked(2).map { it[0] * it[1] }.reduce { acc, i -> acc + i }
    }
}