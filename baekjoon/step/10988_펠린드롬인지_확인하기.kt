import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = br.readLine()
    
    bw.write(if (word == word.reversed()) "1" else "0")
    bw.flush()
    bw.close()
}