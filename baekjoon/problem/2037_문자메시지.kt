import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var prev = ' '
    var count = 0
    val (p, w) = readLine().split(" ").map { it.toInt() }
    readLine().forEach { cur ->
        count += if (isSameNumber(prev, cur)) w + buttonCount(cur) * p else buttonCount(cur) * p
        prev = cur
    }

    bw.write("$count")
    bw.flush()
    bw.close()
}

fun isSameNumber(target1: Char, target2: Char): Boolean {
    return when {
        target1 in 'A'..'C' && target2 in 'A'..'C' -> true
        target1 in 'D'..'F' && target2 in 'D'..'F' -> true
        target1 in 'G'..'I' && target2 in 'G'..'I' -> true
        target1 in 'J'..'L' && target2 in 'J'..'L' -> true
        target1 in 'M'..'O' && target2 in 'M'..'O' -> true
        target1 in 'P'..'S' && target2 in 'P'..'S' -> true
        target1 in 'T'..'V' && target2 in 'T'..'V' -> true
        target1 in 'W'..'Z' && target2 in 'W'..'Z' -> true
        else -> false
    }
}

fun buttonCount(target: Char): Int {
    return when (target) {
        'A', 'D', 'G', 'J', 'M', 'P', 'T', 'W', ' ' -> 1
        'B', 'E', 'H', 'K', 'N', 'Q', 'U', 'X' -> 2
        'C', 'F', 'I', 'L', 'O', 'R', 'V', 'Y' -> 3
        else -> 4
    }
}