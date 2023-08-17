import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = br.readLine().split("-")
    val arr = mutableListOf<Int>()
    for (s in str) {
        val temp = s.split("+")
        arr.add(temp.sumOf { it.toInt() })
    }

    var result = arr[0]
    (1 until arr.size).forEach { result -= arr[it] }

    bw.write("$result")
    bw.flush()
    bw.close()
}