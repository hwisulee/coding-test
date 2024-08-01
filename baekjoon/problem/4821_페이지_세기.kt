import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "0") break

        val arr = IntArray(1001)
        readLine().split(",").forEach {
            val nums = it.split("-").map { it.toInt() }
            if (nums.size > 1) {
                if (nums[0] <= nums[1]) {
                    (nums[0] .. nums[1]).forEach { num ->
                        if (num <= input.toInt()) arr[num]++
                    }
                }
            } else {
                if (nums[0] <= input.toInt()) arr[nums[0]]++
            }
        }

        bw.write("${arr.count { it > 0 }}\n")
    }
    bw.flush()
    bw.close()
}