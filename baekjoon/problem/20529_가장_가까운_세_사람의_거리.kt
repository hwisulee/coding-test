import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.min

var distanceList = mutableListOf<String>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        distanceList.clear()

        val num = readLine().toInt()
        val students = readLine().split(" ")
        var result = Float.POSITIVE_INFINITY

        if (students.size > 32) {
            bw.appendLine("0")
        } else {
            combination(0, 3, 0, students, mutableListOf())

            val group = distanceList.chunked(3)
            for (case in group) {
                val sum = (case[0] + case[1]).toSet().size + (case[1] + case[2]).toSet().size + (case[0] + case[2]).toSet().size - 12
                result = min(result, sum.toFloat())
            }

            bw.appendLine("${result.toInt()}")
        }

        bw.flush()
    }

    bw.close()
}

fun combination(cur: Int, depth: Int, startAt: Int, list: List<String>, temp: MutableList<String>) {
    if (cur == depth) {
        distanceList += temp
    } else {
        for (i in startAt until list.size) {
            temp.add(list[i])
            combination(cur + 1, depth, i + 1, list, temp)
            temp.removeAt(temp.lastIndex)
        }
    }
}