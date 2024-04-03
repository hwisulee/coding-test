import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val l = readLine().toInt()
    readLine().also { 
        bw.write(if (it.count { it == '2' } > it.count { it == 'e' }) {
            "2"
        } else if (it.count { it == '2' } < it.count { it == 'e' }) {
            "e"
        } else {
            "yee"
        })
        
    } 
    bw.flush()
    bw.close()
}