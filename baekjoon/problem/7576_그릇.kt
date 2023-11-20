import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var height = 0
    readLine().also {
        abc@for (i in it.indices) {
            val temp = if (i - 1 >= 0) it[i - 1] else it[i]
            if (i == 0) { height += 10; continue@abc }
            if (it[i] == '(') height += if (temp == it[i]) 5 else 10
            if (it[i] == ')') height += if (temp == it[i]) 5 else 10
        }
    }

    bw.write("$height")
    bw.flush()
    bw.close()
}