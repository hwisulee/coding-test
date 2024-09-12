import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt() * 2 + 2
    val nums = IntArray(n)

    val input = readLine().split(" ").map { it.toInt() }
    var idx = 0
    for (i in 1 until n) {
        if (i % 2 == 1) {
            nums[i] = -1
        } else {
            nums[i] = input[idx]
            idx++
        }
    }

    val a = manachers(nums)

    val m = readLine().toInt()
    repeat(m) {
        val (s, e) = readLine().split(" ").map { it.toInt() }

        bw.write(if (a[s + e] > e - s) "1" else "0")
        bw.newLine()
    }

    bw.flush()
    bw.close()
}

fun manachers(nums: IntArray): IntArray {
    val len = nums.size
    val A = IntArray(len)
    var boundary = 0
    var center = 0

    for (i in 1 until len) {
        if (i > boundary) A[i] = 0 else A[i] = min(A[2 * center - i], boundary - i)

        while (i - A[i] - 1 > 0 && i + A[i] + 1 < len) {
            if (nums[i - A[i] - 1] == nums[i + A[i] + 1]) A[i]++ else break
        }

        if (i + A[i] > boundary) {
            boundary = i + A[i]
            center = i
        }
    }

    return A
}