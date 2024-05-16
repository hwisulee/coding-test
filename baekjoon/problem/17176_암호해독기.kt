import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val password = readLine().split(" ").map { it.toInt() }.sorted()
    val inputArr = readLine().map {
        when (it) {
            ' ' -> 0
            else -> {
                when {
                    it.isLowerCase() -> it - 'a' + 27
                    else -> it - 'A' + 1
                }
            }
        }
    }.sorted()

    if (password.size == inputArr.size) {
        for (i in password.indices) {
            if (password[i] != inputArr[i]) {
                exitAndResult(bw, false)
            }
        }
    } else {
        exitAndResult(bw, false)
    }

    exitAndResult(bw, true)
}

fun exitAndResult(bw: BufferedWriter, result: Boolean) {
    bw.write(if (result) "y" else "n")
    bw.flush()
    bw.close()
    exitProcess(0)
}