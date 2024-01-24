import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.pow


fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${toDecimal(readLine())}")
    bw.flush()
    bw.close()
}

fun toDecimal(n: String): Int {
    var answer = 0
    var sliceIdx = 1
    val base: Double

    when {
        n.startsWith("0x") -> { sliceIdx = 2; base = 16.0 }
        n.startsWith("0") -> { sliceIdx = 1; base = 8.0 }
        else -> { base = 10.0 }
    }

    if (base != 10.0) {
        val temp = n.slice(sliceIdx .. n.lastIndex)
        var power = temp.lastIndex

        for (i in temp.indices) {
            val num = temp[i]
            answer += if (num in 'a'..'z') {
                (num.code - 87) * base.pow(power--).toInt()
            } else {
                (num.code - '0'.code) * base.pow(power--).toInt()
            }
        }
    } else {
        answer = n.toInt()
    }

    return answer
}