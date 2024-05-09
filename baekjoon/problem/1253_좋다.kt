import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toLong() }.sorted()

    repeat(n) {
        val pointer = IntArray(2)
        pointer[1] = n - 1

        while (pointer[0] < pointer[1]) {
            val sum = arr[pointer[0]] + arr[pointer[1]]

            when {
                sum == arr[it] -> {
                    when (it) {
                        pointer[0], pointer[1] -> {
                            if (pointer[0] == it) pointer[0]++
                            if (pointer[1] == it) pointer[1]--
                        }
                        else -> {
                            result++
                            break
                        }
                    }
                }
                sum < arr[it] -> pointer[0]++
                else -> pointer[1]--
            }
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}