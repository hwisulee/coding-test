import kotlin.math.abs
import kotlin.math.pow

fun main(args: Array<String>) {
    println(solution(4, 1, 4, 4))
}

fun solution(a: Int, b: Int, c: Int, d: Int): Int {
    var temp = intArrayOf(a, b, c, d)

    return when {
        temp.groupBy { it }.size == 1 -> 1111 * temp[0]
        temp.groupBy { it }.filter { it.value.size >= 3 }.values.flatten().count() == 3 -> {
            val p = temp.groupBy { it }.filter { it.value.size == 3 }.values.flatten().maxOf { it }
            val q = temp.groupBy { it }.filter { it.value.size == 1 }.values.flatten().maxOf { it }

            ((10 * p + q).toDouble().pow(2.0)).toInt()
        }
        temp.groupBy { it }.size == 2 -> {
            val p = temp.minOf { it }
            val q = temp.maxOf { it }

            (p + q) * abs(p - q)
        }
        temp.groupBy { it }.size == 3 -> {
            val q = temp.groupBy { it }.filter { it.value.size == 1 }.values.flatten().maxOf { it }
            val r = temp.groupBy { it }.filter { it.value.size == 1 }.values.flatten().minOf { it }

            q * r
        }
        temp.groupBy { it }.size == 4 -> temp.minOf { it }
        else -> -1
    }
}