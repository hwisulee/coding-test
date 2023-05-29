import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var differ = 3

    if (n >= 1) {
        var increase = 1

        for (i in 1 .. n) {
            increase *= 2
            differ += increase
        }

        increase = 1
        
        for (i in 1 .. n) {
            increase *= 4
        }

        n = increase
    }

    bw.write("${n + differ}")
    bw.flush()
    bw.close()
}