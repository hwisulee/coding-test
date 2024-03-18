import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(toBinary(readLine()))
    bw.flush()
    bw.close()
}

fun toBinary(n: String): String {
    var num = n.toInt()
    val sb = StringBuilder()

    while (num != 0) {
        val temp = num % 2
        if (temp > 9) {
            sb.insert(0, (temp + 55))
        } else {
            sb.insert(0, temp)
        }

        num /= 2
    }

    return toDecimal(sb.toString().reversed())
}

fun toDecimal(n: String): String {
    var answer = 0
    var power = n.lastIndex

    for (i in n.indices) {
        val num = n[i]
        answer += if (num in 'a' .. 'z') {
            (num.code - 87) * (2.0).pow(power--).toInt()
        } else {
            (num.code - '0'.code) * (2.0).pow(power--).toInt()
        }
    }

    return answer.toString()
}