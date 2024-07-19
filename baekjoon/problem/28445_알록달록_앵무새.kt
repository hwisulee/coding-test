import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (aBody, aTail) = readLine().split(" ")
    val (bBody, bTail) = readLine().split(" ")

    val colors = setOf(aBody, aTail, bBody, bTail)

    val combinations = mutableSetOf<Pair<String, String>>()
    for (body in colors) {
        for (tail in colors) {
            combinations.add(Pair(body, tail))
        }
    }

    combinations.sortedWith(compareBy ({ it.first }, { it.second })).forEach {
        bw.write("${it.first} ${it.second}\n")
    }
    bw.flush()
    bw.close()
}