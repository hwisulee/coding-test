import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = br.readLine().toInt()

    for (i in 1 .. cnt) {
        val word = br.readLine()
        val charSet = mutableSetOf<Char>()
        var last = '0'
        var isGroup = true

        word.forEach {
            if (last != it) {
                last = it
                if (!charSet.add(it)) isGroup = false
            }
        }

        if (!isGroup) cnt--
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}