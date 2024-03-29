import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().replace("[,|;]".toRegex(), "").split(" ").also {
        val common = it[0]

        for (i in 1 until it.size) {
            val sb = StringBuilder()
            val name = StringBuilder()
            sb.append(common)

            var idx = it[i].length - 1
            it[i].reversed().forEach {
                when (it) {
                    '&', '*' -> sb.append(it)
                    in 'a'..'z', in 'A' .. 'Z' -> name.append(it)
                    ']' -> {
                        sb.append("[]")
                        idx--
                    }
                }
            }

            val result = "$sb ${name.reversed()};"
            if (i < it.size - 1) bw.appendLine(result) else bw.append(result)
            bw.flush()
        }
    }

    bw.close()
}