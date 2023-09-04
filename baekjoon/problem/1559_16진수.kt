import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val hex = br.readLine()
    bw.write("${converter(hex)}")
    bw.flush()
    bw.close()
}

fun converter(hex: String): Long {
    var result = 0.toLong()
    var power = hex.length - 1

    for (i in hex.indices) {
        val num = hex[i]
        result += if (num in 'A'..'Z') ((num.code - 55) * 16.0.pow(power--.toDouble())).toLong()
        else ((num.code - '0'.code) * 16.0.pow(power--.toDouble())).toLong()
    }

    return result
}