import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var x = br.readLine().toInt()
    var sum = 1
    var temp = 0

    while (temp < x) {
        temp += sum
        sum ++
    }

    if (sum % 2 == 0) {
        val a = temp - x + 1
        val b = sum - a
        bw.write("$a/$b")
    } else {
        val b = temp - x + 1
        val a = sum - b
        bw.write("$a/$b")
    }

    bw.flush()
    bw.close()
}