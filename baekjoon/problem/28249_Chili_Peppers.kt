import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<Pair<String, Int>>()
    repeat(readLine().toInt()) {
        val cur = readLine()
        list += Pair(cur, pepperToScolville(cur))
    }

    bw.write("${list.sumOf { it.second }}")
    bw.flush()
    bw.close()
}

fun pepperToScolville(pepper: String): Int {
    return when (pepper) {
        "Poblano" -> 1500
        "Mirasol" -> 6000
        "Serrano" -> 15500
        "Cayenne" -> 40000
        "Thai" -> 75000
        else -> 125000
    }
}