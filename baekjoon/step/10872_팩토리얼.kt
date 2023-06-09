import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var acc = 1
    
    for (i in 1 .. n) {
        acc *= i
    }
    
    bw.write("$acc")
    bw.flush()
    bw.close()
}