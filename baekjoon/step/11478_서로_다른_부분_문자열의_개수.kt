import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = br.readLine()
    val set = mutableSetOf<String>()
    
    for (i in 0 .. s.length) {
        for (j in i + 1 .. s.length) {
            set.add(s.substring(i, j))
        }
    }

    bw.write("${set.size}")
    bw.flush()
    bw.close()
}