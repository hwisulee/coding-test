import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val input = readLine().toCharArray()

        val idxArr = IntArray(2)
        for (i in input.lastIndex downTo 1) {
            if (input[i - 1] < input[i]) {
                idxArr[0] = i - 1
                break
            }
        }

        if (idxArr[0] == -1) bw.appendLine(input.joinToString(""))
        else {
            for (i in input.lastIndex downTo 0) {
                if (input[idxArr[0]] < input[i]) {
                    idxArr[1] = i
                    break
                }
            }

            val temp = input[idxArr[0]]
            input[idxArr[0]] = input[idxArr[1]]
            input[idxArr[1]] = temp

            Arrays.sort(input, idxArr[0] + 1, input.size)
            bw.appendLine(input.joinToString(""))
        }

        bw.flush()
    }
    
    bw.close()
}