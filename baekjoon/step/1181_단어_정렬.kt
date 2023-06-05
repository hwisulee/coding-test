import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var arr = Array(n) { "" }
    repeat(n) {
        arr[it] = br.readLine()
    }

   arr = arr.distinct().sortedWith(compareBy<String> { it.length }.thenComparator { a, b ->
       when {
           a > b -> 1
           a < b -> -1
           else -> 0
       }
   }).toTypedArray()

    arr.forEach { bw.write("${it}\n") }
    bw.flush()
    bw.close()
}