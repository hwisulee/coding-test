import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = CharArray(n) { readLine()[0] }
    val result = ArrayList<Char>()

    val index = IntArray(2).also { it[1] = n - 1 }
    while (index[0] <= index[1]) {
        if (arr[index[0]] < arr[index[1]]) {
            result.add(arr[index[0]++])
        } else if (arr[index[0]] == arr[index[1]]) {
            val tempIndex = IntArray(2).also {
                it[0] = index[0]
                it[1] = index[1]
            }
            var check = true

            while (arr[tempIndex[0]] == arr[tempIndex[1]]) {
                if (tempIndex[1] > 0) tempIndex[1]--
                if (tempIndex[0] < n - 1) tempIndex[0]++

                if (arr[tempIndex[0]] < arr[tempIndex[1]]) check = true
                else if (arr[tempIndex[0]] > arr[tempIndex[1]]) check = false
            }

            if (check) result.add(arr[index[0]++]) else result.add(arr[index[1]--])
        } else {
            result.add(arr[index[1]--])
        }
    }

    result.chunked(80).forEach {
        bw.appendLine(it.joinToString(""))
    }
    bw.flush()
    bw.close()
}