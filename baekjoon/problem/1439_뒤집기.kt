import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.min

data class Nums(var zero: Int, var one: Int, var prev: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val arr = IntArray(s.length) { 0 }
    repeat(s.length) { arr[it] = s[it].toString().toInt() }

    val check = mutableListOf<Nums>()
    check.add(Nums(0, 0, -1))
    repeat(arr.size) {
        val num = arr[it]

        if (num != check[0].prev) { if (num == 0) check[0].zero++ else check[0].one++ }
        check[0].prev = num
    }

    bw.write("${min(check[0].zero, check[0].one)}")
    bw.flush()
    bw.close()
}