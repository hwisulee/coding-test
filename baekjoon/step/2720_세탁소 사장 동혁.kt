import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(4) { 0 }

    for (i in 1 .. br.readLine().toInt()) {
        val cent = br.readLine().toInt()

        arr[0] = cent / 25
        arr[1] = (cent % 25) / 10
        arr[2] = ((cent % 25) % 10) / 5
        arr[3] = (((cent % 25) % 10) % 5) / 1

        bw.write("${arr.joinToString(" ")}\n")
    }

    bw.flush()
    bw.close()
}