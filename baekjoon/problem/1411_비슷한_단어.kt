import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    val words = Array<String>(readLine().toInt()) { readLine() }

    for (i in words.indices) {
        for (j in i + 1 until words.size) {
            var check = true
            val hashmap = HashMap<Char, Char>()

            for (k in 0 until words[j].length) {
                val original = words[i][k]
                val temp = words[j][k]
                if (hashmap.containsKey(original)) {
                    if (hashmap[original] != temp) {
                        check = false
                        break
                    }
                } else {
                    val keys = hashmap.keys.iterator()
                    while (keys.hasNext()) {
                        val key = keys.next()
                        if (hashmap[key] == temp) {
                            check = false
                            break
                        }
                    }

                    if (check) hashmap[original] = temp
                }
            }

            if (check) result++
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}