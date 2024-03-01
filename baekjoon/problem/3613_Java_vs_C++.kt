import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var check = false
    val sb = StringBuilder()
    var list = mutableListOf<String>()
    readLine().also {
        if (it[0] == '_' || it[it.lastIndex] == '_' || it.contains("__") || it[0].isUpperCase() || (it.count { it.isUpperCase() } > 0 && it.contains("_"))) {
            list += "Error!"
        } else {
            if (it.count { it.isUpperCase() } == 0 || it.contains("_")) {
                check = true
                list = it.split("_").map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }.toMutableList()
                list[0] = list[0].lowercase()
            } else {
                it.forEachIndexed { index, c ->
                    fun listAdder(list: MutableList<String>, sb: StringBuilder) {
                        list += sb.toString()
                        sb.clear()
                    }

                    if (c.isUpperCase()) listAdder(list, sb)
                    sb.append(c.lowercaseChar())
                    if (index == it.lastIndex) listAdder(list, sb)
                }
            }
        }
    }

    bw.write(if (check) list.joinToString("") else list.joinToString("_"))
    bw.flush()
    bw.close()
}