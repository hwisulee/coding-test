import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, c) = readLine().split(" ").map { it.toInt() }
    val room = MutableList(n) {
        val (a, t) = readLine().split(" ")
        Pair(a.toDouble(), t)
    }

    val total = room.sumOf { it.first }
    val bedroom = room.sumOf { if (it.second == "bedroom") it.first else 0.0 }
    val price = room.map { if (it.second == "balcony") Pair(it.first / 2, it.second) else it }

    bw.write("${total.toInt()}\n${bedroom.toInt()}\n${formatNumber(price.sumOf { it.first } * c)}")
    bw.flush()
    bw.close()
}

fun formatNumber(num: Double): String {
    return if (num == num.toInt().toDouble()) {
        num.toInt().toString()
    } else {
        num.toString()
    }
}