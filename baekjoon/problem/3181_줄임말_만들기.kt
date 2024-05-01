import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val exceptList = arrayListOf("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili")
    val result = readLine().split(" ").let {
        if (exceptList.contains(it[0])) {
            "${it[0][0].uppercase()}${it.filterNot { exceptList.contains(it) }.joinToString("") { it[0].uppercase() }}"
        } else {
            it.filterNot { exceptList.contains(it) }.joinToString("") { it[0].uppercase() }
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}