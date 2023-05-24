import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = br.readLine()
    val intarray = IntArray(('a'..'z').count()) { -1 }

    for (i in word.indices) {
        if (intarray[word[i] - 'a'] != -1) {
            continue
        } else {
            intarray[word[i] - 'a'] = i
        }
    }

    bw.write(intarray.joinToString(" "))
    bw.flush()
    bw.close()
}