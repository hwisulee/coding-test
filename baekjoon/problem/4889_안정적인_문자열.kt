import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var idx = 1
    while (true) {
        val input = readLine()
        when {
            !input.contains("-") -> {
                var cnt = 0
                val stack = Stack<Char>()
                
                for (i in input.indices) {
                    val cur = input[i]
                    
                    if (cur == '{') {
                        stack.add(cur)
                    } else {
                        if (stack.isEmpty()) {
                            stack.add('{')
                            cnt++
                        } else {
                            stack.pop()
                        }
                    }
                }

                bw.write("${idx++}. ${cnt + (stack.size / 2)}\n")
            }
            else -> break
        }
    }
    bw.flush()
    bw.close()
}