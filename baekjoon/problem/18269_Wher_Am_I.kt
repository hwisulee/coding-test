import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine()

    for (i in 1 .. n) {
        val set = mutableSetOf<String>()
        var isUnique = true

        for (j in 0 .. n - i) {
            val subStr = str.substring(j, j + i)
            if (subStr in set) {
                isUnique = false
                break
            }

            set.add(subStr)
        }

        if (isUnique) {
            bw.write("${i}\n")
            bw.flush()
            return
        }
    }
    
    bw.close()
}