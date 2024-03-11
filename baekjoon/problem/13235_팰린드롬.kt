import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val front: String?
    val back: String?
    if (input.length % 2 == 0) {
        front = input.slice(0 until input.length / 2)
        back = input.slice(input.length / 2 .. input.lastIndex).reversed()
    } else {
        front = input.slice(0 .. input.length / 2)
        back = input.slice(input.length / 2 .. input.lastIndex).reversed()
    }

    bw.write(if (front == back) "true" else "false")
    bw.flush()
    bw.close()
}